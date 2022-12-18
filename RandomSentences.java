import java.util.Random;

public class RandomSentences {
    public static void main(String[] args){
        String[] names={"Peter", "Michell", "Jane", "Steve"};
        String[] places={"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs={"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns={"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs={"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details={"near the river", "at home", "in the park"};
        System.out.println("Click [Enter] to generate a new one:");
        System.out.println("Hello, this is your first random-generated sentence: ");

        while(true) {
            String randomName=getRandomName(names);
            String randomPlace=getRandomPlace(places);
            String randomVerb=getRandomVerb(verbs);
            String randomNoun=getRandomNoun(nouns);
            String randomAdverb=getRandomAdverb(adverbs);
            String randomDetails=getRandomDetail(details);
            System.out.printf("%s from %s %s %s %s %s%n",randomName, randomPlace, randomAdverb, randomVerb, randomNoun, randomDetails);
        }
    }
    public static String getRandomName(String[] names){
        Random random=new Random();
        int randomIndex=random.nextInt(names.length);
        String name =names[randomIndex];
        return name;
    }
    public static String getRandomPlace(String[] places){
        Random random=new Random();
        int randomIndex=random.nextInt(places.length);
        String place =places[randomIndex];
        return place;
    }
    public static String getRandomVerb(String[] verbs){
        Random random=new Random();
        int randomIndex=random.nextInt(verbs.length);
        String verb =verbs[randomIndex];
        return verb;
    }
    public static String getRandomNoun(String[] nouns){
        Random random=new Random();
        int randomIndex=random.nextInt(nouns.length);
        String noun =nouns[randomIndex];
        return noun;
    }
    public static String getRandomAdverb(String[] adverbs){
        Random random=new Random();
        int randomIndex=random.nextInt(adverbs.length);
        String adverb =adverbs[randomIndex];
        return adverb;
    }
    public static String getRandomDetail(String[] details){
        Random random=new Random();
        int randomIndex=random.nextInt(details.length);
        String detail =details[randomIndex];
        return detail;
    }
}
