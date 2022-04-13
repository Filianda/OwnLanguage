declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [3 x i8] c"%s\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"
@s = constant [3 x i8] c"ww\00"
@a = global [3 x i8] c"01\0A"
@strss = constant [3 x i8] c"%s\00"
define i32 @main() nounwind{
%1 = getelementptr inbounds [3 x i8], [3 x i8]* @s, i32 0, i32 0
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strps, i32 0, i32 0), i8* %1)
%3 = getelementptr inbounds [3 x i8], [3 x i8]* @a, i32 0, i32 0
%4 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strss, i32 0, i32 0), i8* %3)
%5 = getelementptr inbounds [3 x i8], [3 x i8]* @a, i32 0, i32 0
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strps, i32 0, i32 0), i8* %5)
ret i32 0 }

