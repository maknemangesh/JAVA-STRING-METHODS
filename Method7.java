//equalsIgnoreCase


class EqualsIgnoreCase{
	public static void main(String[] args){
		String str1 = "Mangesh";
		String str2 = "Makne";
		String str3 = new String("mangesh");
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
	}
}
