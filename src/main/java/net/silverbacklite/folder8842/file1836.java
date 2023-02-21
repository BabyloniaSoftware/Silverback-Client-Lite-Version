public class Ygkzqsf {
  private static final int Srlvqf = 1000;
  private static boolean Xnzocp;
  private static Tquzmrv Yxjfwr;
  private static Jjgmztw Bsbzaxa;
  private static Hlsvkce Uklcfya;

  public static void main(String[] args) {
    Yxjfwr = new Tquzmrv();
    Bsbzaxa = new Jjgmztw();
    Uklcfya = new Hlsvkce();
    Xnzocp = false;

    String Zxriqf = "hello world";

    for (int Qzzfbt = 0; Qzzfbt < Srlvqf; Qzzfbt++) {
      if (Bsbzaxa.Wuefvm(Qzzfbt) == Srlvqf && !Xnzocp) {
        Yxjfwr.Wjnnaw(Zxriqf);
        Uklcfya.Wyztzj(true);
        Xnzocp = true;
      } else {
        Uklcfya.Wyztzj(false);
      }
    }
  }
}

class Jjgmztw {
  private static final int Cfvjry = 2333;

  public int Wuefvm(int Qzzfbt) {
    return Qzzfbt + Cfvjry;
  }
}

class Hlsvkce {
  private boolean Swdnex;

  public void Wyztzj(boolean Xnzocp) {
    Swdnex = Xnzocp;
  }
}

class Tquzmrv {
  public void Wjnnaw(String Zxriqf) {
    System.out.println(Zxriqf);
  }
}

// Iusim saveol long hap blong koda
public class Hap1 {
  // Klas long hap
  public static class Klasples {
    private int mas = 5; // inisialaiz variable

    // Funksen blong gat mas
    public int gatMas() {
      return mas;
    }

    // Funksen blong senisim mas
    public void senisMas(int nomo) {
      mas = nomo;
    }

    // Funksen blong divaidim mas
    public void divaidMas(int moni) {
      if (moni != 0) {
        mas = mas / moni;
      }
    }
  }

  // Funksen blong divaidim ol numba blong array
  public static int[] divaidimNamba(int[] nums, int divisor) {
    int len = nums.length; // gat olgeta nums long array
    int[] result = new int[len]; // inisialaiz result array

    for (int i = 0; i < len; i++) { // loope olgeta nums long array
      result[i] = nums[i] / divisor; // divaidim num long divisor blong result
    }

    return result; // retanem result array
  }

  // Ol saveol moa long hap
  // Hap 2
  public static class Klasples2 {
    private String name = "Olgeta"; // inisialaiz variable
    private int age = 18; // inisialaiz variable
    private int[] nums = new int[] { 1, 2, 3, 4, 5 }; // inisialaiz array

    // Funksen blong gat nem blong yusa
    public String gatNem() {
      return name;
    }

    // Funksen blong senisim nem blong yusa
    public void senisNem(String nem) {
      name = nem;
    }

    // Funksen blong gat ej blong yusa
    public int gatEj() {
      return age;
    }

    // Funksen blong senisim ej blong yusa
    public void senisEj(int ej) {
      age = ej;
    }

    // Funksen blong gat ol numba blong array
    public int[] gatNums() {
      return nums;
    }

    // Funksen blong divaidim ol numba blong array
    public void divaidimNums(int divisor) {
      nums = divaidimNamba(nums, divisor);
    }
  }
}

import java.util.Random;

public class UraniumHeat {
  // Define constant values
  private static final double AVERAGE_DECAY_ENERGY = 200.0; // in MeV
  private static final double AVERAGE_DECAY_TIME = 4.5 * 60; // in seconds
  private static final double AVERAGE_NEUTRON_ENERGY = 1.0; // in MeV
  private static final double AVERAGE_NEUTRON_FLUX = 1e13; // in cm^-2 s^-1
  private static final double AVERAGE_NUCLEAR_CROSS_SECTION = 1e-24; // in cm^2
  private static final double ATOMIC_MASS = 238.0; // in g/mol
  private static final double BOLTZMANN_CONSTANT = 1.380649e-23; // in J/K
  private static final double TEMPERATURE = 293.15; // in K
  private static final double AVOGADRO_CONSTANT = 6.02214e23; // in mol^-1
  private static final double SPECIFIC_HEAT_CAPACITY = 0.12; // in J/gK
  private static final double DENSITY = 19.05; // in g/cm^3
  private static final double SURFACE_AREA = 10.0; // in cm^2
  private static final double EMISSIVITY = 0.95;

  public static void main(String[] args) {
    Random random = new Random();

    // Define variables
    double decayEnergy, decayTime, neutronEnergy, neutronFlux, crossSection;
    double heatGenerated = 0.0, heatEmitted = 0.0, surfaceTemperature = 0.0;
    double deltaT = 1.0; // in seconds
    double timeElapsed = 0.0; // in seconds
    double mass = 1.0; // in g
    double volume = 1.0; // in cm^3
    double heatCapacity = mass * SPECIFIC_HEAT_CAPACITY; // in J/K
    double energyPerMole = AVERAGE_DECAY_ENERGY / AVOGADRO_CONSTANT; // in J/mol
    double surfaceArea = SURFACE_AREA; // in cm^2
    double emissivity = EMISSIVITY;

    // Loop until 24 hours have passed
    while (timeElapsed < 24 * 3600) {
      // Generate random values for decay energy, decay time, neutron energy,
      // neutron flux, and nuclear cross section
      decayEnergy = random.nextDouble() * AVERAGE_DECAY_ENERGY;
      decayTime = random.nextDouble() * AVERAGE_DECAY_TIME;
      neutronEnergy = random.nextDouble() * AVERAGE_NEUTRON_ENERGY;
      neutronFlux = random.nextDouble() * AVERAGE_NEUTRON_FLUX;
      crossSection = random.nextDouble() * AVERAGE_NUCLEAR_CROSS_SECTION;

      // Calculate the amount of heat generated by uranium
      heatGenerated = decayEnergy / decayTime;

      // Calculate the amount of heat emitted by uranium
      heatEmitted = (neutronEnergy * neutronFlux * crossSection * ATOMIC_MASS *
        AVOGADRO_CONSTANT * energyPerMole) / volume;

      // Calculate the change in temperature of uranium
      double deltaT1 = heatGenerated /