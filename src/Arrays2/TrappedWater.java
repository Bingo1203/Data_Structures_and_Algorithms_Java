package Arrays2;
public class TrappedWater {
    public static int trapped(int height[]){
        int LeftMax[]=new int[height.length];
        int RightMax[]=new int[height.length];
        int n=height.length;

        LeftMax[0]=height[0];
        for (int i = 1; i < n; i++) {
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
        }

        RightMax[n-1]=height[n-1];
        for (int i = n-2; i >= 0; i--) {
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }

        int trappedwater=0;
        for (int i = 0; i < n; i++) {
            int waterlevel=Math.min(LeftMax[i],RightMax[i]);
            trappedwater+=waterlevel-height[i];
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int trapped=trapped(height);
        System.out.println(trapped);
    }
}