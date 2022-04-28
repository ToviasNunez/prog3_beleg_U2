package observerPattern;

import logc.G_logik;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ConcreteSubjectCapasity implements Subject {

    private List<Beobachter> beobachtersCapacityList = new ArrayList<>();

    @Override
    public void meldeAn(Beobachter beobachter) {

        beobachtersCapacityList.add(beobachter);
    }

    @Override
    public void meldeAb(Beobachter beobachter) {
        beobachtersCapacityList.remove(beobachter);
    }

    @Override
    public void notificate() {
        for (Beobachter beobachter : beobachtersCapacityList) {
            beobachter.update();
        }
    }

    private BigDecimal size ;


    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {

        this.size = size;
       double max = G_logik.maxsize;
       double alert = max*90/100;
        if(this.size.compareTo(BigDecimal.valueOf(alert)) > 0){
            this.notificate();
        }



    }
}
