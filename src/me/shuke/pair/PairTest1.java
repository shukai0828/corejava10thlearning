package me.shuke.pair;

public class PairTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] words = {"Mary", "had", "a", "little", "lamb"};
		Pair<String> mm= ArrayAlg.minmax(words);
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getSecond());

	}

}
