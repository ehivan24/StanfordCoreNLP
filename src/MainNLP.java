import edu.stanford.nlp.simple.*;
public class MainNLP {
	public static void main(String[] args){
		Document document = new Document("Love looks not with the eyes, but with the mind; and therefore is winged Cupid painted blind. "+
										"To thine own self be true, and it must follow, as the night the day, thou canst not then be false to any man."+
										"Love all, trust a few, do wrong to none.");
		for(Sentence sent: document.sentences()){
			System.out.println("The second word of the sentence: " + sent + " " + sent.word(1));
			System.out.println("The third lemma of the sentence: " + sent + " " + sent.lemma(2));			
			System.out.println("The second word of the sentence: " + sent + " " + sent.parse());
		}
	}
}
