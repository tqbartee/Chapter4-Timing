public class TimingEvaluation {
    // Input size N for first and planned second test runs
    // Usually N2 for tests will be double N1
    int N1;
    int N2;
    // Test result in seconds for test run 1
    double elapsedTimeTest1Seconds;
    // Computed values based on input sizes
    // Multiplier is proportion of inputs - N2/N1
    double multiplier;
    // Figure out growth factors
    double logN1;
    double logN2;
    double growthLogN;
    // growthN is growth from N factor
    double growthN;
    // Now NlogN calculations
    double nLogN1;
    double nLogN2;
    double growthNLogN;
    // Growth for quadratic factor
    double N1Squared;
    double N2Squared;
    double growthNSquaredQuadratic;
    // Growth for cubic factor
    double N1Cubed;
    double N2Cubed;
    double growthNCubed;
    // Exponential
    double N1Exponential;
    double N2Exponential;
    double growthExponential;

    // String representations of these for reporting
    // Only need for the float/double
    String formattedLogN1;
    String formattedLogN2;
    String formattedGrowthLogN;
    String formattedGrowthN;
    String formattedNLogN1;
    String formattedNLogN2;
    String formattedGrowthNLogN;
    String formattedN1Squared;
    String formattedN2Squared;
    String formattedGrowthNSquaredQuadratic;
    String formattedN1Cubed;
    String formattedN2Cubed;
    String formattedGrowthNCubed;

    // Expected times for the second run (seconds)
    double growthLogNExpectedTime;
    double growthNExpectedTime;
    double growthNLogNExpectedTime;
    double growthNSquaredQuadraticExpectedTime;
    double growthNCubedExpectedTime;

    // String representations of these for reporting
    String formattedGrowthLogNExpectedTime;
    String formattedGrowthNExpectedTime;
    String formattedGrowthNLogNExpectedTime;
    String formattedGrowthNSquaredQuadraticExpectedTime;
    String formattedGrowthNCubedExpectedTime;

    // Now the variables associated with the second time
    // First the elapsed time for the second run
    double elapsedTimeTest2Seconds;
    // Now compute the percentage of expected times
    double percentOfLogNExpectedTime;
    double percentOfGrowthNExpectedTime;
    double percentOfGrowthNLogNExpectedTime;
    double percentOfGrowthNSquaredQuadraticExpectedTime;
    double percentOfGrowthNCubedExpectedTime;

    //public void TimingEvaluation() {
    //    System.out.println("A new one");
    //}

    public void generatePredictionValues(int inputN1, int inputN2, double inputElapsedSeconds) {
        System.out.println("Now generating prediction values...");
        N1 = inputN1;
        N2 = inputN2;
        elapsedTimeTest1Seconds = inputElapsedSeconds;

        // Now make predictions for second run times
        multiplier = this.N2/this.N1;
        // Now compute expected values based on input size (student exercise)
        logN1 =  Math.log(N1) / Math.log(2);
        logN2 =  Math.log(N2) / Math.log(2);
        growthLogN = logN2/logN1;
        growthN = N2/N1;
        nLogN1 = N1*logN1;
        nLogN2 = N2*logN2;
        growthNLogN = nLogN2/nLogN1;
        N1Squared = Math.pow(N1,2);
        N2Squared = Math.pow(N2,2);
        growthNSquaredQuadratic = N2Squared/N1Squared;
        N1Cubed = Math.pow(N1,3);
        N2Cubed = Math.pow(N2,3);
        growthNCubed = N2Cubed/N1Cubed;
        // Now computed expected running times based on algorithm
        // growth rates
        growthLogNExpectedTime = growthLogN*elapsedTimeTest1Seconds;
        growthNExpectedTime = growthN*elapsedTimeTest1Seconds;
        growthNLogNExpectedTime = growthNLogN*elapsedTimeTest1Seconds;
        growthNSquaredQuadraticExpectedTime = growthNSquaredQuadratic*elapsedTimeTest1Seconds;
        growthNCubedExpectedTime = growthNCubed*elapsedTimeTest1Seconds;
    }

    public void printPredictionReport() {
        System.out.println("PrintPredictionValues - Generate Report Here");
        // Now print these numbers
        System.out.println(N1);
        System.out.println(N2);
        System.out.println("multiplier is: " + multiplier);
        formattedLogN1 = String.format("%.4f", logN1);
        System.out.println("Log of N1 is: " + formattedLogN1);
        formattedLogN2 = String.format("%.4f", logN2);
        System.out.println("Log of N2 is: " + formattedLogN2);
        formattedGrowthLogN = String.format("%.4f", growthLogN);
        System.out.println("Expected growth of LogN is: " + formattedGrowthLogN);
        //System.out.println(N1);
        //System.out.println(N2);
        formattedGrowthN = String.format("%.4f", growthN);
        System.out.println("Expected growth of N is: " + formattedGrowthN);
        formattedNLogN1 = String.format("%.4f", nLogN1);
        System.out.println("NLogN of N1 is: " + formattedNLogN1);
        formattedNLogN2 = String.format("%.4f", nLogN2);
        System.out.println("NLogN of N2 is: " + formattedNLogN2);
        formattedGrowthNLogN = String.format("%.4f", growthNLogN);
        System.out.println("Expected growth of NLogN is: " + formattedGrowthNLogN);
        formattedN1Squared = String.format("%.4f", N1Squared);
        System.out.println("N1^2 is: " + formattedN1Squared);
        formattedN2Squared = String.format("%.4f", N2Squared);
        System.out.println("N2^2 is: " + formattedN2Squared);
        formattedGrowthNSquaredQuadratic = String.format("%.4f", growthNSquaredQuadratic);
        System.out.println("Expected growth of N^2 is: " + formattedGrowthNSquaredQuadratic);
        formattedN1Cubed = String.format("%.4f", N1Cubed);
        System.out.println("N1^3 is: " + formattedN1Cubed);
        formattedN2Cubed = String.format("%.4f", N2Cubed);
        System.out.println("N2^3 is: " + formattedN2Cubed);
        formattedGrowthNCubed = String.format("%.4f", growthNCubed);
        System.out.println("Expected growth of N^3 is: " + formattedGrowthNCubed);

        // Now print the expected run times for the next run
        // Show for each of the problem types
        System.out.println("Expected Run Times:");
        // Now the prints
        formattedGrowthLogNExpectedTime = String.format("%.4f", growthLogNExpectedTime);
        formattedGrowthNExpectedTime = String.format("%.4f", growthNExpectedTime);
        formattedGrowthNLogNExpectedTime = String.format("%.4f", growthNLogNExpectedTime);
        formattedGrowthNSquaredQuadraticExpectedTime = String.format("%.4f", growthNSquaredQuadraticExpectedTime);
        formattedGrowthNCubedExpectedTime = String.format("%.4f", growthNCubedExpectedTime);
        //
        System.out.println("LogN growth expected running time for trial 2:  " +
                formattedGrowthLogNExpectedTime + " seconds");
        System.out.println("N growth expected running time for trial 2:     " +
                formattedGrowthNExpectedTime + " seconds");
        System.out.println("NLogN growth expected running time for trial 2: " +
                formattedGrowthNLogNExpectedTime + " seconds");
        System.out.println("N^2 growth expected running time for trial 2:   " +
                formattedGrowthNSquaredQuadraticExpectedTime + " seconds");
        System.out.println("N^3 growth expected running time for trial 2:   " +
                formattedGrowthNCubedExpectedTime + " seconds");
    }

    public void generatePostTestValues(double inputElapsedSeconds) {
        // Now calculate the percentages
        elapsedTimeTest2Seconds = inputElapsedSeconds;
        percentOfLogNExpectedTime = (elapsedTimeTest2Seconds/growthLogNExpectedTime)*100;
        percentOfGrowthNExpectedTime = (elapsedTimeTest2Seconds/growthNExpectedTime)*100;
        percentOfGrowthNLogNExpectedTime = (elapsedTimeTest2Seconds/growthNLogNExpectedTime)*100;
        percentOfGrowthNSquaredQuadraticExpectedTime = (elapsedTimeTest2Seconds/growthNSquaredQuadraticExpectedTime)*100;
        percentOfGrowthNCubedExpectedTime = (elapsedTimeTest2Seconds/growthNCubedExpectedTime)*100;
    }

    public void printPostTestReport() {
        String formattedElapsedTimeTest2Seconds = String.format("%.4f", elapsedTimeTest2Seconds);
        String formattedPercentOfLogNExpectedTime = String.format("%.4f", percentOfLogNExpectedTime);
        String formattedPercentOfGrowthNExpectedTime = String.format("%.4f", percentOfGrowthNExpectedTime);
        String formattedPercentOfGrowthNLogNExpectedTime = String.format("%.4f", percentOfGrowthNLogNExpectedTime);
        String formattedPercentOfGrowthNSquaredQuadraticExpectedTime =
                String.format("%.4f", percentOfGrowthNSquaredQuadraticExpectedTime);
        String formattedPercentOfGrowthNCubedExpectedTime =
                String.format("%.4f", percentOfGrowthNCubedExpectedTime);

        System.out.println(formattedElapsedTimeTest2Seconds);
        System.out.println("Percent of LogN expected time: " + formattedPercentOfLogNExpectedTime + '%');
        System.out.println("Percent of N growth expected time: " + formattedPercentOfGrowthNExpectedTime + '%');
        System.out.println("Percent of NLogN growth expected time: " + formattedPercentOfGrowthNLogNExpectedTime + '%');
        System.out.println("Percent of N^2 expected time: " + formattedPercentOfGrowthNSquaredQuadraticExpectedTime + '%');
        System.out.println("Percent of N^3 expected time: " + formattedPercentOfGrowthNCubedExpectedTime + '%');

    }

}
