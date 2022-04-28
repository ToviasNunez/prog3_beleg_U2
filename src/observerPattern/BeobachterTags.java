package observerPattern;

import logc.G_logik;
import mediaDB.Tag;

import java.math.BigDecimal;
import java.util.Collection;

public class BeobachterTags implements Beobachter{

    private ConcreteSubjectTags concreteSubjectTags;
    private Collection<Tag> altTags;


    public BeobachterTags(ConcreteSubjectTags concreteSubjectTags){
        this.concreteSubjectTags = concreteSubjectTags;
        this.concreteSubjectTags.meldeAn(this);
        this.altTags = this.concreteSubjectTags.getTag();
    }

    @Override
    public void update() {
        Collection<Tag> newTags = concreteSubjectTags.getTag();
     if (altTags != newTags)
         System.out.println("the old one ist:" + altTags);
         System.out.println("The tags had been changed " + newTags);



    }
}
