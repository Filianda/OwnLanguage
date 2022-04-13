declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"
@l = constant[7 x i8] c"%s\0A\00"
define i32 @main() nounwind{
%l = alloca [7 x i8]
store [7 x i8] "dupa", [7 x i8]* %l
%1 = getelementptr inbounds [6 x i8], [6 x i8]* @l, i32 0, i32 0
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps2, i32 0, i32 0), i8* %1)
ret i32 0 }

