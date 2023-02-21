public class BoltzmannBrainProbabilityCalculator {
    public static double calculateBoltzmannBrainProbability(double universeAgeInYears, double universeSizeInMeters) {
        double hbar = 1.054571817e-34; // Planck constant divided by 2*pi in units of J*s
        double c = 299792458; // speed of light in meters per second
        double k = 1.380649e-23; // Boltzmann constant in units of J/K

        double universeAgeInSeconds = universeAgeInYears * 365.25 * 24 * 60 * 60; // convert years to seconds
        double universeSizeInMetersSquared = Math.pow(universeSizeInMeters, 2); // calculate square of universe size

        double temperature = (hbar * c) / (4 * k * universeAgeInSeconds); // calculate temperature of universe
        double entropy = (Math.PI / 2) * Math.pow(k * temperature / hbar, 3/2) * universeSizeInMetersSquared; // calculate entropy of universe
        double boltzmannBrainProbability = Math.exp(-entropy); // calculate probability of Boltzmann brain

        return boltzmannBrainProbability;
    }

    public static void main(String[] args) {
        double universeAgeInYears = 13.8; // age of universe in billions of years
        double universeSizeInMeters = 93.27e+23; // estimated size of observable universe in meters

        double probability = calculateBoltzmannBrainProbability(universeAgeInYears, universeSizeInMeters);

        System.out.println("The probability of a Boltzmann brain in our observable universe is: " + probability);
    }
}
