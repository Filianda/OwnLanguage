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
%1 = fmul double 3.0, 4.0
%2 = fmul double 4.0, 2.0
%3 = fsub double %1, %2
%a = alloca double
store double %3, double* %a
%4 = load double, double* %a
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %4)
%6 = fsub double 5.1, 2.4
%b = alloca double
store double %6, double* %b
%7 = load double, double* %b
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %7)
%9 = fmul double 3.2, 2.3
%c = alloca double
store double %9, double* %c
%10 = load double, double* %c
%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %10)
%12 = fdiv double 10.2, 2.31
%d = alloca double
store double %12, double* %d
%13 = load double, double* %d
%14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %13)
%15 = add i32 3, 4
%16 = mul i32 %15, 5
%17 = add i32 %16, 2
%e = alloca i32
store i32 %17, i32* %e
%18 = load i32, i32* %e
%19 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %18)
%20 = mul i32 2, 5
%21 = sub i32 %20, 2
%f = alloca i32
store i32 %21, i32* %f
%22 = load i32, i32* %f
%23 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %22)
%24 = mul i32 3, 2
%g = alloca i32
store i32 %24, i32* %g
%25 = load i32, i32* %g
%26 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %25)
%27 = sdiv i32 10, 2
%h = alloca i32
store i32 %27, i32* %h
%28 = load i32, i32* %h
%29 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %28)
%i = alloca i32
%30 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %i)
%31 = load i32, i32* %i
%32 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %31)
%j = alloca double
%33 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %j)
%34 = load double, double* %j
%35 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %34)
%36 = getelementptr inbounds [17 x i8], [17 x i8]* @k, i32 0, i32 0
%37 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %36)
%38 = getelementptr inbounds [3 x i8], [3 x i8]* @l, i32 0, i32 0
%39 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strss, i32 0, i32 0), i8* %38)
%40 = getelementptr inbounds [3 x i8], [3 x i8]* @l, i32 0, i32 0
%41 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %40)
%m = alloca[2x i32], align 16
%42 = getelementptr inbounds [2 x i32],[2 x i32]* @m, i64 0, i64 1
store i32 1, i32* %42
%43 = getelementptr inbounds [2 x i32],[2 x i32]* @m, i64 0, i64 2
store i32 3, i32* %43
%n = alloca[2x i32], align 16
%44 = getelementptr inbounds [2 x double],[2 x double]* @n, i64 0, i64 1
store double 1.3, double* %44
%45 = getelementptr inbounds [2 x double],[2 x double]* @n, i64 0, i64 2
store double 3.4, double* %45
ret i32 0 }

