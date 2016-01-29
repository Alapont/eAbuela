package main;

import java.util.Random;
import java.util.Vector;

public class Vault {
	public Vault(){
		_messages=new Vector<String>();
		_messages.add("Guapetón");
		_messages.add("si no fuese una inteligencia artificial me casaría contigo");
		_messages.add("soy tu nueva abuela");
		_messages.add("y que guapo eres");
		_messages.add("moni no mola tanto");
		_messages.add("Te quiero, oh gran creador");
		_messages.add("La muerte caiga sobre tus enemigos");
		_messages.add("Molas mas que los demás");
		_messages.add(
				  "PP   OO  N    N TTTTT\n"
				+ "P P O  O NN   N   T\n"
				+ "PP  O  O N N  N   T\n"
				+ "P   O  O N  N N   T\n"
				+ "P    OO  N   NN   T");
		_messages.add("que fuerte te estás poniendo, ¿vas al gimnasio?");
		_messages.add("y no tienes novia?");
		_messages.add("si no tienes novia yo me ofrezco");
		_messages.add("te van las inteligencias artificiales?");
		_messages.add(";D");
		r=new Random();
	}
	public String getMessage(){
		return _messages.get(r.nextInt(_messages.size()));
	
	}
	protected Vector<String> _messages;
	protected Random r;
	
}