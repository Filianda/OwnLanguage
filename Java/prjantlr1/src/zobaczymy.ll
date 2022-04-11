declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpg = constant [3 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%1 = add i32 2, 3
%2 = mul i32 2, %1
%a = alloca i32
store i32 %2, i32* %a
%3 = sub i32 2, 4
%b = alloca i32
store i32 %3, i32* %b
%4 = mul i32 3, 2
%c = alloca i32
store i32 %4, i32* %c
%5 = udiv i32 2, 10
%d = alloca i32
store i32 %5, i32* %d
%6 = load i32, i32* %a
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %6)
%8 = load i32, i32* %b
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %8)
%10 = load i32, i32* %c
%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %10)
%12 = load i32, i32* %d
%13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %12)
%14 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strg, i32 0, i32 0), i32* %d)
%15 = load i32, i32* %d
%16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %15)
ret i32 0 }

