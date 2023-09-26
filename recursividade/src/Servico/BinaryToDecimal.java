package Servico;

public class BinaryToDecimal {
   
        public static int binaryToDecimal(String binary) {
            return binaryToDecimalRecursive(binary, 0, binary.length() - 1);
        }
    
        private static int binaryToDecimalRecursive(String binary, int startIndex, int endIndex) {
            if (startIndex > endIndex) {
                return 0;
            }
    
            char currentBit = binary.charAt(endIndex);
            int currentBitValue = Character.getNumericValue(currentBit);
    
            int smallerProblem = binaryToDecimalRecursive(binary, startIndex, endIndex - 1);
    
            return (currentBitValue * (int) Math.pow(2, binary.length() - 1 - endIndex)) + smallerProblem;
        }

    }

