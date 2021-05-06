public class Korting{

    private int klantMaanden;
    private int positieveReview;
    private int leeftijd;
    private int gekochteProduct;

    public Korting(int klantMaanden, int positieveReview, int leeftijd, int gekochteProduct) {
        this.klantMaanden = klantMaanden;
        this.positieveReview = positieveReview;
        this.leeftijd = leeftijd;
        this.gekochteProduct = gekochteProduct;
    }

    public String maandenOpties(){
        String optie1 = "Minder dan 12 maanden";
        String optie2 = "Meer dan 12 maanden";

        if(klantMaanden < 12){
            return optie1;
        }else if(klantMaanden >= 12){
            return optie2;
        }
        return maandenOpties();
    }

    public String reviewOpties(){
        String optie1 = "Laag(<25)";
        String optie2 = "Gemiddeld(>25)";

        if(positieveReview < 25){
            return optie1;
        }else if(positieveReview > 25) {
            return optie2;
        }
        return reviewOpties();
    }

    public String leeftijdOpties(){
        String optie1 = "Jonger dan 18";
        String optie2 = "Ouder dan 18";

        if(leeftijd < 18){
            return optie1;
        }else if(leeftijd >= 18) {
            return optie2;
        }
        return leeftijdOpties();
    }

    public String gekochteProductOpties(){
        String optie1 = "Laag(<25)";
        String optie2 = "Gemiddeld(>25)";

        if(gekochteProduct < 25){
            return optie1;
        }else if(gekochteProduct >25){
            return optie2;
        }
        return gekochteProductOpties();
    }

    public double decision(){
        if(gekochteProduct < 25){
            return 5.0;
        }else if(gekochteProduct > 25){
            return 25.0;
        }
        return decision();
    }

    public boolean geefKortingControle() {
        if (klantMaanden > 12 && leeftijd > 18){
            return true;
        }else if(positieveReview > 0 && leeftijd >18){
            return true;
        }else
            return false;
    }

    public int kortingPer12Maanden(){
        int price = 5;

        if(klantMaanden == 12){
            return price;
        }else if(klantMaanden == 24){
            return price *2;
        }else if(klantMaanden == 36){
            return price *3;
        }else if(klantMaanden == 48){
            return price *4;
        }else if(klantMaanden == 60){
            return price *5;
        }
        return price;
    }

    public int reviewsGegeven(){
        int kortingReview = 10;

        if(positieveReview > 0){
            return kortingReview;
        }else return 0;
    }

    public double geldPerAangeschafteProduct(){
        double geldNaAanschaffing = 0.5;
        double resultaat = gekochteProduct * geldNaAanschaffing;
        return resultaat;
        }
    }
