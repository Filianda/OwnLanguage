import java.util.StringTokenizer;

class LLVMGenerator2 {
    static String header_text = "";
    static String main_text = "";
    static int reg = 1;



    static void scanf_i32(String id){
        main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %"+id+")\n";
        reg++;
    }

    static void scanf_double(String id){
        main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %"+id+")\n";
        reg++;
    }


    static void declare_i32(String id){
        main_text += "%"+id+" = alloca i32\n";
    }

    static void declare_double(String id){
        main_text += "%"+id+" = alloca double\n";
    }

    static void assign_i32(String id, String value){
        main_text += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void assign_double(String id, String value){
        main_text += "store double "+value+", double* %"+id+"\n";
    }

    static void printf_i32(String id){
        main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_double(String id){
        main_text += "%"+reg+" = load double, double* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }

    static void add_i32(String val1, String val2){
        main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void add_double(String val1, String val2){
        main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
        reg++;
    }

    static void sub_i32(String val1, String val2){
        main_text += "%"+reg+" = sub i32 "+val2+", "+val1+"\n";
        reg++;
    }

    static void sub_double(String val1, String val2){
        main_text += "%"+reg+" = fsub double "+val2+", "+val1+"\n";
        reg++;
    }

    static void mul_i32(String val1, String val2){
        main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void mul_double(String val1, String val2){
        main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
        reg++;
    }

    static void div_i32(String val1, String val2){
        main_text += "%"+reg+" = sdiv i32 "+val2+", "+val1+"\n";
        reg++;
    }

    static void div_double(String val1, String val2){
        main_text += "%"+reg+" = fdiv double "+val2+", "+val1+"\n";
        reg++;
    }


    static void declare_assign_string(String id, String string) {
        StringTokenizer st = new StringTokenizer(string, "\"");
        String text = st.nextToken();
        int len = text.length() + 1;
        String str_type = "[" + len + " x i8]";
        header_text += "@" + id + " = constant " + str_type + " c\""+ text+"\\00\"\n";
    }
    static void declare_assign_string(String id, int size) {
        size++;
        String str_type = "[" + size + " x i8]";
        StringBuilder helper = new StringBuilder();
        for (int i = 0; i < size-1; i++) {
            helper.append(i);
        }
                header_text += "@" + id + " = global " + str_type + " c\""+helper+"\\0A\"\n";
    }

    static void scanf_string(String id, int len) {
        len++;
        String str_type = "[" + len + " x i8]";
        main_text += "%"+reg+" = getelementptr inbounds "+str_type+", "+str_type+"* @"+id+", i32 0, i32 0\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ("+str_type+", "+str_type+"* @strss, i32 0, i32 0), i8* %" +(reg-1)+")\n";
        reg++;
        StringBuilder helper = new StringBuilder();
        for (int i = 0; i < len-3; i++) {
            helper.append(i);
        }
        header_text += "@strss = constant "+str_type+" c\"%s"+helper+"\\00\"\n";
    }

    static void printf_string(String id, int len){
//        len--; //bo len jest razem z cudzyslowiem i nie bierzemy go pod uwage

        String str_type = "[" + len + " x i8]";
        main_text += "%"+reg+" = getelementptr inbounds "+str_type+", "+str_type+"* @"+id+", i32 0, i32 0\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strps, i32 0, i32 0), i8* %" +(reg-1)+")\n";
        reg++;
//        main_text += "call i32 @puts(i8* %  )\n";
//        reg++;
    }

    static String generate(){
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strps = constant [3 x i8] c\"%s\\00\"\n";
        text += "@strsi = constant [3 x i8] c\"%d\\00\"\n";
        text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n";
//        text += "@strss = constant [5 x i8] c\"%s  \\00\"\n";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }
}
