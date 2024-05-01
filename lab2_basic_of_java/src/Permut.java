public class Permut {

    public static void main(String[] args) {
        int N = 10; // 假设N = 1...10
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = i + 1;  //初始化
        }

        generatePermutations(nums, 0);
    }

    // 生成1到N的所有排列
    public static void generatePermutations(int[] nums, int index) {
        if (index == nums.length) { //递归的终止条件
            printArray(nums);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i); //交换
            generatePermutations(nums, index + 1); //递归
            swap(nums, index, i);
        }
    }

    // 交换数组中两个元素的位置
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 打印数组
    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
