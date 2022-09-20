package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int n = 0;
        StringBuilder phrase = new StringBuilder();
        while (n < chars.length){
            phrase.append(chars[n]);
            n++;
        }
        System.out.println(phrase);
    }
}
