public class Runner {

    public static void main(String[] args) {
        Planet myPlanet = new Planet("Mars", 908973);
        String planetName = myPlanet.getName();
        int planetSize = myPlanet.getSize();
        System.out.println(String.format("%1$s is %2$s size", planetName, planetSize));

        System.out.println(String.format("Boom! %1$s has exploded.",planetName));
    }
}
