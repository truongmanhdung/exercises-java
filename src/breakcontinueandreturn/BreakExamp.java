package breakcontinueandreturn;

public class BreakExamp {
    public static void main(String[] args) {
        // có 2 loại break là không có label và dạng có label
        //Câu lệnh break được sử dụng để kết thúc vòng lặp ngay lập tức.
        // vd ko có label
        int i = 0, j = 0;

        for(i = 0; i<10; i++){
            for(j = 0; j < 20; j++){
                if(j >10){
                    break;
                }
            }
            System.out.println("Vòng lặp bên trong vòng for ko co label: " + "i = " + i + " - j = " + j);
        }
        System.out.println("Vòng lặp bên ngoài vòng for ko co label: " + "i = " + i + " - j = " + j);


//        vd có label
        vongFor: for(i = 0; i<10; i++){
            for(j = 0; j < 20; j++){
                if(j >10){
                    break vongFor;
                }
            }
            System.out.println("Vòng lặp bên trong vòng for cos label: " + "i = " + i + " - j = " + j);
        }
        System.out.println("Vòng lặp bên ngoài vòng for co label: " + "i = " + i + " - j = " + j);

    }
}
