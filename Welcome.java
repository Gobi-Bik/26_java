package BookMarket;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = new String(scan.next());
		System.out.print("연락처 입력 : ");
		String num = new String(scan.next());

		String greeting = new String("Welcome to Shopping Mall");
		String tagline = new String("Welcome to Book Market");
		boolean quit = false;

		while (!quit) {
			System.out.println("==========================================");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			System.out.println("==========================================");
			System.out.println("1. 고객 정보 확인\t4. 바구니에 항목 추가");
			System.out.println("2. 장바구니 상품 목록 확인\t5. 장바구니 항목 수량 감소");
			System.out.println("3. 장바구니 비우기\t6. 장바구니의 항목 삭제");
			System.out.println("7. 영수증 표시\t8. 종료");
			System.out.println("==========================================");
			System.out.print("메뉴 선택 : ");
			int n = scan.nextInt();

			if (n < 1 || n > 8) {
				System.out.println("1부터 8까지의 숫자 입력");
			} else {
				switch (n) {
				case 1:
					System.out.println("현재 고객 정보 : ");
					System.out.println("이름 : " + name + ", 연락처 : " + num);
					break;
				case 2:
					System.out.println("2. 장바구니 상품 목록 보기");
					break;
				case 3:
					System.out.println("3. 장바구니 비우기");
					break;
				case 4:
					System.out.println("4. 바구니에 항목 추가");
					break;
				case 5:
					System.out.println("5. 장바구니의 항목 수량 감소");
					break;
				case 6:
					System.out.println("6. 장바구니의 항목 삭제");
					break;
				case 7:
					System.out.println("7. 영수증 표시");
					break;
				case 8:
					System.out.println("8. 종료");
					quit = true;
					break;
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
