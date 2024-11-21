package Pattern.Builder;

public class Loan {
    private int loanId;
    private String customerName;
    private String customerLoanType;
    private int rateOfInterest;

    private String customerEmail;
    private int customerMobileNumber;

    private int taxDeduction;

    public static LoanBuilder builder() {
        return new LoanBuilder();
    }


    public static class LoanBuilder {
        private int loanId;
        private String customerName;
        private String customerLoanType;
        private int rateOfInterest;

        private String customerEmail;
        private int customerMobileNumber;

        private int taxDeduction;


        public LoanBuilder loanId(int id) {
            loanId = id;
            return this;
        }

        public LoanBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public LoanBuilder customerLoanType(String customerLoanType) {
            this.customerLoanType = customerLoanType;
            return this;
        }


        public LoanBuilder rateOfInterest(int rateOfInterest) {
            this.rateOfInterest = rateOfInterest;
            return this;
        }

        public LoanBuilder customerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public LoanBuilder customerMobileNumber(int customerMobileNumber) {
            this.customerMobileNumber = customerMobileNumber;
            return this;
        }

        public LoanBuilder taxDeduction(int taxDeduction) {
            this.taxDeduction = taxDeduction;
            return this;
        }

        public Loan build() {
            Loan loan = new Loan();
            loan.customerEmail=this.customerEmail;
            loan.customerLoanType=this.customerLoanType;
            loan.customerMobileNumber=this.customerMobileNumber;
            loan.rateOfInterest=this.rateOfInterest;
            loan.customerName=this.customerName;
            loan.loanId=this.loanId;
            loan.taxDeduction=this.taxDeduction;
            return  loan;
        }


    }

    @Override
    public String toString() {
        return "LoanBuilder{" +
                "loanId=" + loanId +
                ", customerName='" + customerName + '\'' +
                ", customerLoanType='" + customerLoanType + '\'' +
                ", rateOfInterest=" + rateOfInterest +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerMobileNumber=" + customerMobileNumber +
                ", taxDeduction=" + taxDeduction +
                '}';
    }

}
