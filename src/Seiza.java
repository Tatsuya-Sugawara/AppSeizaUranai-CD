
public class Seiza {


	public static void main(String[] args){
		int[] rand = Random.randomInt(12);
		aries(rand[0] + 1);
		taurus(rand[1] + 1);
		gemini(rand[2] + 1);
		cancer(rand[3] + 1);
		leo(rand[4] + 1);
		virgo(rand[5] + 1);
		libra(rand[6] + 1);
		scorpio(rand[7] + 1);
		sagittarius(rand[8] + 1);
		capricorn(rand[9] + 1);
		aquarius(rand[10] + 1);
		pisces(rand[11] + 1);



	}


			//numには1 ～ 12が入ります

	public static void aries(int num){
		//牡羊座

	}

	public static void taurus(int num){
		//牡牛座

	}

	public static void gemini(int num){
		//ふたご座
		switch (num){
		case 1:
			System.out.println("１位！！");
			System.out.println("ラッキーポイント：温かいお茶");
			break;
		case 2:
			System.out.println("２位！！");
			System.out.println("ラッキーポイント：熱帯魚の画像");
			break;
		case 3:
			System.out.println("３位！！");
			System.out.println("ラッキーポイント：ビーズブレスレット");
			break;
		case 4:
			System.out.println("４位");
			System.out.println("ラッキーポイント：ミルクティー");
			break;
		case 5:
			System.out.println("５位");
			System.out.println("ラッキーポイント：エスニック調味料");
			break;
		case 6:
			System.out.println("６位");
			System.out.println("ラッキーポイント：野菜の鉢植え");
			break;
		case 7:
			System.out.println("７位");
			System.out.println("ラッキーポイント：塗り絵");
			break;
		case 8:
			System.out.println("８位");
			System.out.println("ラッキーポイント：旅行ガイドブック");
			break;
		case 9:
			System.out.println("９位");
			System.out.println("ラッキーポイント：梅干し");
			break;
		case 10:
			System.out.println("１０位");
			System.out.println("ラッキーポイント：ジーパン");
			break;
		case 11:
			System.out.println("１１位");
			System.out.println("ラッキーポイント：星がデザインされた小物");
			break;
		case 12:
			System.out.println("１２位");
			System.out.println("ラッキーポイント：海鮮丼");
			break;
		}
	}

	public static void cancer(int num){
		//かに座
	}

	public static void leo(int num){
		//獅子座
	}

	public static void virgo(int num){
		//おとめ座

	}

	public static void libra(int num){
		//天秤座

	}

	public static void scorpio(int num){
		//さそり座

	}

	public static void sagittarius(int num){
		//いて座

	}

	public static void capricorn(int num){
		//やぎ座

	}

	public static void aquarius(int num){
		//みずがめ座
	}

	public static void pisces(int num){
		//うお座
	}

}
