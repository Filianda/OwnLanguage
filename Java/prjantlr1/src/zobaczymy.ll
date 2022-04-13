declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [3 x i8] c"%s\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"
@xy = constant [3 x i8] c"ww\00"
@n = global [3 x i8] c"01\0A"
@strss = constant [3 x i8] c"%s\00"
define i32 @main() nounwind{
%1 = getelementptr inbounds [3 x i8], [3 x i8]* @xy, i32 0, i32 0
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strps, i32 0, i32 0), i8* %1)
%3 = getelementptr inbounds [3 x i8], [3 x i8]* @n, i32 0, i32 0
%4 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strss, i32 0, i32 0), i8* %3)
%5 = getelementptr inbounds [3 x i8], [3 x i8]* @n, i32 0, i32 0
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strps, i32 0, i32 0), i8* %5)
%7 = fmul double 3.0, 4.0
%8 = fmul double 4.0, 2.0
%9 = fsub double %7, %8
%a = alloca double
store double %9, double* %a
%10 = fsub double 5.1, 2.4
%b = alloca double
store double %10, double* %b
%11 = fmul double 3.2, 2.3
%c = alloca double
store double %11, double* %c
%12 = fdiv double 10.2, 2.31
%d = alloca double
store double %12, double* %d
%13 = add i32 3, 4
%14 = mul i32 %13, 5
%15 = add i32 %14, 2
%j = alloca i32
store i32 %15, i32* %j
%16 = mul i32 2, 5
%17 = sub i32 %16, 2
%s = alloca i32
store i32 %17, i32* %s
%18 = mul i32 3, 2
%f = alloca i32
store i32 %18, i32* %f
%19 = sdiv i32 10, 2
%h = alloca i32
store i32 %19, i32* %h
%20 = load double, double* %a
%21 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %20)
%22 = load double, double* %b
%23 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %22)
%24 = load double, double* %c
%25 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %24)
%26 = load double, double* %d
%27 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %26)
%28 = load i32, i32* %j
%29 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %28)
%30 = load i32, i32* %s
%31 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %30)
%32 = load i32, i32* %f
%33 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %32)
%34 = load i32, i32* %h
%35 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %34)
%r = alloca double
%36 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %r)
%37 = load double, double* %r
%38 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %37)
%i = alloca i32
%39 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %i)
%40 = load i32, i32* %i
%41 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %40)
ret i32 0 }

