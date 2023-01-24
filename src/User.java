
public class User {


        double capitalInicial;
        int diaDelAno;
        double interesesTotales;

        public User(double capital,int dia,double interes ){
            this.capitalInicial=capital;
            this.diaDelAno=dia;
            this.interesesTotales= interes;
        }

        public double getCapitalInicial() {
            return capitalInicial;
        }

        public void setCapitalInicial(double capitalInicial) {
            this.capitalInicial = capitalInicial;
        }

        public int getDiaDelAno() {
            return diaDelAno;
        }

        public void setDiaDelAno(int diaDelAno) {
            this.diaDelAno = diaDelAno;
        }

        public double getInteresesTotales() {
            return interesesTotales;
        }

        public void setInteresesTotales(double interesesTotales) {
            this.interesesTotales = interesesTotales;
        }

}
