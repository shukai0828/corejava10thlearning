package me.shuke.enums;

import java.util.*;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Size: [SMALL, MEDIUM, LARGE, EXTRA_LARGE]");
		String input = in.next().toUpperCase();
		
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("Size = "+size);
		System.out.println("abbre = "+size.getAbbre());
		if(size == Size.EXTRA_LARGE) {
			System.out.println("Good job!");
		}
	}

}
