declare i32 @printf(i8*, ...)
@strpd = constant [4 x i8] c"%f\0A\00"
define i32 @main() nounwind{
%1 = fadd double 2.1, 4.5
%a = alloca double
store double %1, double* %a
%2 = load double, double* %a
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %2)
ret i32 0 }
