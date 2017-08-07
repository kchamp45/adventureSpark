

    /**
     * Created by shypunekar & Kimberly on 8/3/17.
     */
    public class AdventureSpark {

        private String inputOne;
        private String inputTwo;

        public String getInputOne() {
            return inputOne;
        }

        public String getInputTwo() {
            return inputTwo;
        }

        public AdventureSpark(){
            this.inputOne = inputOne;
            this.inputTwo = inputTwo;
        }

        private String result;

        public String firstResult ="forest";


        public String pathChoice(String input1, String input2) {
            if(input1.equals("1")){

                if (input2.equals ("3")){
                    result = firstResult +  " grandma";
                } else {
                    result =firstResult + " Wolf's den";
                }

            }else {
                result = "deadend";

            }
            return result;

        }
        }



