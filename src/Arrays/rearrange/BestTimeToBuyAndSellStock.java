package Arrays.rearrange;

public class BestTimeToBuyAndSellStock {
    public static void main(String [] args) {
        //int [] A =   {7, 1, 5, 3, 6, 4};
        //int [] A =   {7, 6, 4, 3, 1};
        int[] A = {2, 4, 1};
        int buyingPrice = Integer.MAX_VALUE;
        int sellingPrice = 0;
        int maxProfit = 0;
        boolean shouldSalesStock = false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < buyingPrice) {
                buyingPrice = A[i];
            } else if (A[i] - buyingPrice > maxProfit) {
                maxProfit = A[i] - buyingPrice;
                //shouldSalesStock = true;
            }

            if (shouldSalesStock) {

            }
            //maxProfit = sellingPrice - buyingPrice;
            System.out.println("Profit is --->" + maxProfit);
        }
    }
}
