package part_04;

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

      // iterate through array and determine max value in array
    public static int getMaxVal(int[][] dataArray) {

        int max=dataArray[0][0];

        for(int i=0; i < 4; i++)
            for(int j=0; j < 3; j++)
               if (dataArray[i][j]>max)
                   max=dataArray[i][j];

        for(int j=3; j < 5; j++) {
            if (dataArray[1][j]>max)
                max=dataArray[1][j];
        }

        if (dataArray[2][3]>max)
            max=dataArray[2][3];

        for(int j=3; j < 6; j++) {
            if (dataArray[3][j]>max)
                max=dataArray[3][j];
        }
        return max;
    }


      // iterate through array and determine minimum value
    public static int getMinVal(int[][] dataArray) {
        int min=dataArray[0][0];

        for(int i=0; i < 4; i++)
            for(int j=0; j < 3; j++)
                if (dataArray[i][j]<min)
                    min=dataArray[i][j];

        for(int j=3; j < 5; j++) {
            if (dataArray[1][j]<min)
                min=dataArray[1][j];
        }

        if (dataArray[2][3]<min)
            min=dataArray[2][3];

        for(int j=3; j < 6; j++) {
            if (dataArray[3][j]<min)
                min=dataArray[3][j];
        }
        return min;

    }
}
