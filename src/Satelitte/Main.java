/**
 * 
 */
package Satelitte;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Pierre-Henry Barge
 *
 */
public class Main {
	

	public static void main(String[] arguments) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("Satelitte");
		context.refresh();
		
		Satellite satellite = (Satellite) context.getBean("Satellite");
		System.out.println("Charge Utile ID" + satellite.chargeUtile());
		System.out.println("Plateforme Mecanique ID" + satellite.plateformeMecanique());
		
		PanneauSolaire1 panneauSolaire1 = (PanneauSolaire1) context.getBean("PanneauSolaire1");
		System.out.println("Panneau solaire 1 ID" + panneauSolaire1.idPanneauSolaire1());
		
		PanneauSolaire2 panneauSolaire2 = (PanneauSolaire2) context.getBean("PanneauSolaire2");
		System.out.println("Panneau solaire 2 ID" + panneauSolaire2.idPanneauSolaire2());
		
		AntenneRadio antenneRadio = (AntenneRadio) context.getBean("AntenneRadio");
		System.out.println("Antenne radio ID" + antenneRadio.antenneRadio());
		
		context.close();
	}	
}
