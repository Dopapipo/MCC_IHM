/**
 * Une première classe représentant une voiture
 *
 * @author David Gayerie
 */
public class Voiture {

  private float vitesse;

  /**
   * @return La vitesse en km/h de la voiture
   */
  public float getVitesse() {
    return vitesse;
  }

  /**
   * Pour accélérer la voiture
   * @param deltaVitesse Le vitesse supplémentaire
   */
  public void accelerer(float deltaVitesse) {
    vitesse = vitesse + deltaVitesse;
  }

  /**
   * Pour décélérer la voiture
   * @param deltaVitesse Le vitesse à soustraire
   */
  public void decelerer(float deltaVitesse) {
    vitesse = vitesse - deltaVitesse;
  }

  /**
   * Freiner la voiture.
   */
  public void freiner() {
    vitesse = 0;
  }

  /**
   * Représentation de l'objet sous la forme
   * d'une chaîne de caractères.
   */
  public String toString() {
    return "La voiture roule actuellement à " + vitesse + " km/h.";
  }

  public static void main(String[] args) {
    Voiture voiture = new Voiture();

    System.out.println(voiture);

    voiture.accelerer(110);
    System.out.println(voiture);

    voiture.decelerer(20);
    System.out.println(voiture);

    voiture.freiner();
    System.out.println(voiture);
  }
}
