package Pattern.Builder;

public class Main {
    public static void main(String[] args) {
        Loan loan1=Loan.builder()
                .loanId(1)
                .customerName("ashish")
                .customerEmail("ashish@gmail.com")
                .customerMobileNumber(987666665)
                .customerLoanType("car loan").build();

        System.out.println(loan1);

        Loan loan2=Loan.builder()
                .loanId(2)
                .customerLoanType("Home loan")
                .customerEmail("bhanu@gmail.com")
                .rateOfInterest(34)
                .taxDeduction(89)
                .build();
        System.out.println(loan2);
    }
}
