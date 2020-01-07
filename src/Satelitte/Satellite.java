/**
 * 
 */
package Satelitte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Pierre-Henry Barge
 *
 */
@Component("Satellite")
public class Satellite {
	
	private PlateformeMecanique plateformeMecanique;
	private ChargeUtile chargeUtile;
	private PanneauSolaire1 panneauSolaire1;
	private PanneauSolaire2 panneauSolaire2;
	private AntenneRadio antenneRadio;
	
	public Satellite(PlateformeMecanique plateformeMecanique, ChargeUtile chargeUtile) {
		super();
		this.plateformeMecanique = plateformeMecanique;
		this.chargeUtile = chargeUtile;
	}
@Autowired
	public void setPanneauSolaire1(PanneauSolaire1 panneauSolaire1) {
		this.panneauSolaire1 = panneauSolaire1;
	}
@Autowired
	public void setPanneauSolaire2(PanneauSolaire2 panneauSolaire2) {
		this.panneauSolaire2 = panneauSolaire2;
	}

	public ChargeUtile chargeUtile() {
		// TODO Auto-generated method stub
		return chargeUtile;
	}
	
	public PlateformeMecanique plateformeMecanique() {
		// TODO Auto-generated method stub
		return plateformeMecanique;
	}
	
	public void setAntenneRadio(AntenneRadio antenneRadio) {
		this.antenneRadio = antenneRadio;
	}
	

}
