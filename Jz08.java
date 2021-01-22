public class Jz08 {
    public int JumpFloor(int target) {
        if(target == 1 || target == 2 || target == 0) return target;
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}