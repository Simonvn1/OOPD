
public class LottoMachine {
	private Glazenbol trekker;
	private Scorebord bord;
	
	public LottoMachine() {
		trekker = new Glazenbol();
		bord = new Scorebord();
	}
	
	public void voerTrekkingUit(){
		trekker.verzamelAlleBallen();
		bord.maakLeeg();
		for(int i = 0; i<6; i++) {
		bord.plaatsBal(trekker.schepBal());
		}
		bord.plaatsBonusBal(trekker.schepBal());
		bord.sorteerBallen();
		bord.printScorebord();
	}
}
