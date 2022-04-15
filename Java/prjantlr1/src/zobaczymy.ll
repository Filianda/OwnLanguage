declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"
@k = constant [17 x i8] c"wpiszJakasLitere\00"
@l = global [3 x i8] c"01\0A"
@strss = constant [3 x i8] c"%s\00"
@m = common dso_local global [2 x i32] zeroinitializer, align 16
@n = common dso_local global [2 x double] zeroinitializer, align 16
define i32 @main() nounwind{
%x = alloca i32
store i32 5, i32* %x
%1 = load i32, i32* %x
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
%y = alloca double
store double 4.4, double* %y
%3 = fmul double 3.0, 4.0
%4 = fmul double 4.0, 2.0
%5 = fsub double %3, %4
%a = alloca double
store double %5, double* %a
%6 = load double, double* %a
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %6)
%8 = fsub double 5.1, 2.4
%b = alloca double
store double %8, double* %b
%9 = load double, double* %b
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %9)
%11 = fmul double 3.2, 2.3
%c = alloca double
store double %11, double* %c
%12 = load double, double* %c
%13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %12)
%14 = fdiv double 10.2, 2.31
%d = alloca double
store double %14, double* %d
%15 = load double, double* %d
%16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %15)
%17 = add i32 3, 4
%18 = mul i32 %17, 5
%19 = add i32 %18, 2
%e = alloca i32
store i32 %19, i32* %e
%20 = load i32, i32* %e
%21 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %20)
%22 = mul i32 5, 2
%23 = sub i32 2, %22
%f = alloca i32
store i32 %23, i32* %f
%24 = load i32, i32* %f
%25 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %24)
%26 = mul i32 3, 2
%g = alloca i32
store i32 %26, i32* %g
%27 = load i32, i32* %g
%28 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %27)
%29 = sdiv i32 10, 2
%h = alloca i32
store i32 %29, i32* %h
%30 = load i32, i32* %h
%31 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %30)
%i = alloca i32
%32 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %i)
%33 = load i32, i32* %i
%34 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %33)
%j = alloca double
%35 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %j)
%36 = load double, double* %j
%37 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %36)
%38 = getelementptr inbounds [17 x i8], [17 x i8]* @k, i32 0, i32 0
%39 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %38)
%40 = getelementptr inbounds [3 x i8], [3 x i8]* @l, i32 0, i32 0
%41 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strss, i32 0, i32 0), i8* %40)
%42 = getelementptr inbounds [3 x i8], [3 x i8]* @l, i32 0, i32 0
%43 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %42)
%m = alloca[2x i32], align 16
%44 = getelementptr inbounds [2 x i32],[2 x i32]* @m, i64 0, i64 1
store i32 2, i32* %44
%45 = getelementptr inbounds [2 x i32],[2 x i32]* @m, i64 0, i64 2
store i32 3, i32* %45
%n = alloca[2x double], align 16
%46 = getelementptr inbounds [2 x double],[2 x double]* @n, i64 0, i64 1
store double 1.3, double* %46
%47 = getelementptr inbounds [2 x double],[2 x double]* @n, i64 0, i64 2
store double 3.4, double* %47
ret i32 0 }

