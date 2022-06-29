
public class Main {
    public static void main(String[] args) {

 //1.
        System.out.println("Sveiki");
        int variable = 1984;

        String vardas = " Sergejus ";
        String pavarde = " Jerofejevas ";
        System.out.println("As esu " + vardas + pavarde + "Man yra " + (2022-variable) );
// 2.
        System.out.println( "Uzduotis Nr.:2" );
        double varRnd1 = Math.random()*4;
        double varRnd2 = Math.random()*4;

        System.out.println(varRnd1);
        System.out.println(varRnd2);
        if (varRnd1>varRnd2) {

            System.out.println(Math.round((varRnd1/varRnd2)*100.0)/100.0);

        } else if (varRnd2>varRnd1) {

            System.out.println(Math.round((varRnd2/varRnd1)*100.0)/100.0);
        }


//3.
        /*
        Naudokite funkcija Math.random().
         Sukurkite tris kintamuosius ir
         naudodamiesi funkcija Math.random()
         jiems priskirkite atsitiktines reikšmes nuo 0 iki 25.
         Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.

        * */
        System.out.println( "Uzduotis Nr.:3" );
        int varRnd3_1 = (int) (Math.random() * (24 + 1));
        int varRnd3_2 = (int) (Math.random() * (24 + 1));
        int varRnd3_3 = (int) (Math.random() * (24 + 1));
        System.out.println(varRnd3_1);
        System.out.println(varRnd3_2);
        System.out.println(varRnd3_3);

            //antros reiksm. patikrinimas
        if ((varRnd3_1 < varRnd3_2 && varRnd3_2 < varRnd3_3) || (varRnd3_3 < varRnd3_2 && varRnd3_2 < varRnd3_1))
            System.out.println("Vid. reiksme: " + varRnd3_2);

            // pirmos reiksmes tikrinimas
        else if ((varRnd3_2 < varRnd3_1 && varRnd3_1 < varRnd3_3) || (varRnd3_3 < varRnd3_1 && varRnd3_1 < varRnd3_2))
            System.out.println("Vidurine reiksme: " + varRnd3_1);

        else
            System.out.println("Vid. reiksme: " + varRnd3_3);


        System.out.println(" ");
//4.
        /*
        Įvedami skaičiai -a, b, c –kraštinių ilgiai,
         trys kintamieji (naudojame int) (naudokite ​Math.random()​ funkcija nuo 1 iki 10).
         Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.
*/
        System.out.println( "Uzduotis Nr.:4:" );
        System.out.println("");

        //int getRandomValue = (int) (Math.random()*(max-min)) + min;
        //  if((a+b)>c && (a+c)>b && (b+c)>a)
        int varRnd4_1 = (int) (Math.random() * (10-1)+1);
        int varRnd4_2 = (int) (Math.random() * (10-1)+1);
        int varRnd4_3 = (int) (Math.random() * (10-1)+1);
        System.out.println(varRnd4_1);
        System.out.println(varRnd4_2);
        System.out.println(varRnd4_3);

        if((varRnd4_1+varRnd4_2)>varRnd4_3 && (varRnd4_1+varRnd4_3)>varRnd4_2 && (varRnd4_2+varRnd4_3)>varRnd4_1) {
            System.out.println("Trikampis OK");
        }else {
            System.out.println("Trikampis negalimas!");
        }



//5. /*
// Sukurkite keturis kintamuosius ir ​Math.random()​ funkcija sugeneruokite jiems
//reikšmes nuo 0 iki 2.
// Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).
//
// */
        System.out.println( "Uzduotis Nr.:5:" );
        System.out.println("");
        //0..2
        int varRnd5_1 = (int) (Math.random() * (2-0)+0);
        int varRnd5_2 = (int) (Math.random() * (2-0)+0);
        int varRnd5_3 = (int) (Math.random() * (2-0)+0);
        int varRnd5_4 = (int) (Math.random() * (2-0)+0);
        System.out.println(varRnd5_1);
        System.out.println(varRnd5_2);
        System.out.println(varRnd5_3);
        System.out.println(varRnd5_4);
        var countForZero = 0;
        var countForOne = 0;
        var countForTwo = 0;

        if (varRnd5_1 == 0) {countForZero++;};
        if (varRnd5_2 == 0) {countForZero++;};
        if (varRnd5_3 == 0) {countForZero++;};
        if (varRnd5_4 == 0) {countForZero++;};

        if (varRnd5_1 == 1) {countForOne++;};
        if (varRnd5_2 == 1) {countForOne++;};
        if (varRnd5_3 == 1) {countForOne++;};
        if (varRnd5_4 == 1) {countForOne++;};
;
        if (varRnd5_1 == 2) {countForTwo++;};
        if (varRnd5_2 == 2) {countForTwo++;};
        if (varRnd5_3 == 2) {countForTwo++;};
        if (varRnd5_4 == 2) {countForTwo++;};

        System.out.println("Nuliu " + countForZero + " Vienetu: " + countForOne + " Dvejetu: " + countForTwo);


//6.
        /*
Naudokite funkcija Math.random().
Atspausdinkite 3 skaičius nuo -10 iki 10.
 Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.
 Math.random()*(max-min)) + min
         * */
        System.out.println( "Uzduotis Nr.6:" );
        System.out.println("");

        int varRnd6_1 = (int) (Math.random() * (10-(-10))+(-10));
        int varRnd6_2 = (int) (Math.random() * (10-(-10))+(-10));
        int varRnd6_3 = (int) (Math.random() * (10-(-10))+(-10));
        System.out.println(varRnd6_1);
        System.out.println(varRnd6_2);
        System.out.println(varRnd6_3);


        if (varRnd6_1<0) System.out.println("[" + varRnd6_1+ "]");
        if (varRnd6_2<0) System.out.println("[" + varRnd6_2+ "]");
        if (varRnd6_3<0) System.out.println("[" + varRnd6_3+ "]");

        if (varRnd6_1 == 0) System.out.println("{" + varRnd6_1+ "}");
        if (varRnd6_2 == 0) System.out.println("{" + varRnd6_2+ "}");
        if (varRnd6_3 == 0) System.out.println("{" + varRnd6_3+ "}");

        if (varRnd6_1 > 0) System.out.println("{" + varRnd6_1+ "}");
        if (varRnd6_2 > 0) System.out.println("{" + varRnd6_2+ "}");
        if (varRnd6_3 > 0) System.out.println("{" + varRnd6_3+ "}");

//7.
        /*
        Įmonė parduoda žvakes po 1 EUR.
         Perkant daugiau kaip už 1000 EUR taikoma 3 % nuolaida,
         daugiau kaip už 2000 EUR - 4 % nuolaida.
         Parašykite programą, kuri skaičiuos žvakių kainą
         ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama.

         Žvakių kiekį generuokite ​Math.random()​ funkcija nuo 5 iki 3000.
int k = (int)(value*(percentage/100.0f));
int k = (int)(120*50.0/100.0);

        * */
        System.out.println( "Uzduotis Nr.7:  " );
        System.out.println(" ");

        int varRnd7_1 = (int) (Math.random() * (3000-5)+5);
        double kaina = 1.0;
        kaina = kaina * varRnd7_1;
        System.out.println("Zvakiu kaina:  " + kaina);

        if (varRnd7_1>1000) {
            System.out.println(kaina - (kaina*3.0/100.0));
        }
//8.
        /*
        Naudokite funkcija Math.random().
         Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100.
         Paskaičiuokite jų aritmetinį vidurkį.
         Ir aritmetinį vidurkį atmetus tas reikšmes,
          kurios yra mažesnės nei 10 arba didesnės nei 90.
           Abu vidurkius atspausdinkite.
           Rezultatus apvalinkite iki sveiko skaičiaus.
 Math.random()*(max-min)) + min
        * */
        System.out.println( "Uzduotis Nr.8:  " );
        System.out.println(" ");
        int vR8_1 = (int) (Math.random() * (100-0)+0);
        int vR8_2 = (int) (Math.random() * (100-0)+0);
        int vR8_3 = (int) (Math.random() * (100-0)+0);
        int vR8_4 = (int) (Math.random() * (100-0)+0);
        System.out.println(vR8_1);
        System.out.println(vR8_2);
        System.out.println(vR8_3);
        System.out.println(vR8_4);

        System.out.println("Aritmetinis: ");
        int aritmetinis =(vR8_1+vR8_2+vR8_3+vR8_4)/4;
        System.out.println(aritmetinis);

        aritmetinis = 0;

        //aritmetinis = 10<90;
        if (10 <= vR8_1 && vR8_1 <= 90){aritmetinis = aritmetinis + vR8_1;}
        if (10 <= vR8_2 && vR8_2 <= 90){aritmetinis = aritmetinis + vR8_2;}
        if (10 <= vR8_3 && vR8_3 <= 90){aritmetinis = aritmetinis + vR8_2;}
        if (10 <= vR8_4 && vR8_4 <= 90){aritmetinis = aritmetinis + vR8_2;}
        System.out.println("Aritmetinis tarp 10 ir 90:   " + aritmetinis/4);

    }
}