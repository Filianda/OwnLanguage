declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%1 = add i32 2, 2
%a = alloca i32
store i32 %1, i32* %a
%2 = sub i32 2, 2
%b = alloca i32
store i32 %2, i32* %b
%3 = mul i32 3, 2
%c = alloca i32
store i32 %3, i32* %c
%4 = div i32 2, 2
%d = alloca i32
store i32 %4, i32* %d
%5 = load i32, i32* %a
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %5)
%7 = load i32, i32* %b
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
%9 = load i32, i32* %c
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %9)
%11 = load i32, i32* %d
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %11)
ret i32 0 }

