package methodDef;

class SinivelCap{ //콧물 처치용 캡슐
	void take() {
		System.out.println("콧물이 싹 납니다 ");
	}
		void take() {
			System.out.println("재채기가  싹 납니다 ");
		}
}
		
		class SnuffleCap{
			void take() {
				System.out.println("코가뻥 뿔립니다 ");
			}
	}
		
		
		class ColdPatient{
			void takeSinivelCap(SinivelCap cap) {
				cap.take();
		}
			
				void takeSneezeCap(SneezeCap cap) {
					cap.take();
			}
					void takeSnuffleCap(SnuffleCap cap) {
						cap.take();
				}
		}
public class BadEncapsulation {

	public static void main(String[] args) {
		
		ColdPatient suf = new ColdPatient();
		
		suf.takeSinivelCap(new SinivelCap()); //콧물 캡슐 구매 후 복용
		
		suf.takeSneezeCap(new SneezeCap()); //재채기  캡슐 구매 후 복용
		
		suf.takeSnuffleCap(new SnuffleCap()); //코막힘 캡슐  구매 후 복용
	}

}
