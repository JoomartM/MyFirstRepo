package javafaker;

import com.github.javafaker.Faker;

public class Demo {
    public static Faker faker = new Faker();
    public static void main(String[] args) {
        System.out.println(generateFakeFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateFakeEmailAddress());
        System.out.println(generateFakeArtistName());
        System.out.println(generateFakeProgrammingLang());
        System.out.println(generateFakeAnimalName());
        System.out.println(generateFakekl());
        System.out.println();
    }

    public static String generateFakeFirstName(){
        return "first name is : "+faker.name().firstName();
    }
    public static String generateFakeLastName(){
        return "Last Name is: " + faker.name().lastName();
    }
    public static String generateFakeEmailAddress(){
        return "Email address is: " + faker.internet().emailAddress();
    }
    public static String generateFakeArtistName(){
        return "Artist name is: " + faker.artist().name();
    }
    public static String generateFakeAnimalName(){
        return "Animal is: " + faker.animal().name();
    }
    public static String generateFakeProgrammingLang(){
        return "Programming Language is: " + faker.programmingLanguage();
    }
    public static String generateFakekl(){
        return "kl is: " + faker.file().fileName();
    }

}
