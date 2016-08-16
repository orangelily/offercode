## 0814
* 牛客网刷题编译运行通过，在本机intelli-j使用gradle完成编码并上传到github

################
1. 二叉搜索树的后序遍历序列
  输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
  假设输入的数组的任意两个数字都互不相同。
  #########
    测试用例：
    int[] nullA = {};

    int[] oneA = {1};

    int[] a = {1,3,2,5,7,6,4};
    root:   4
    <4 i=3
    left： 1,3,2,  -->root:2 left：1  right:3
    >4
    right：5,7,6,-->root:6 left：5  right:7

    int[] b = {1,7,4,8,10,9,5};
    root:   5
    <5 i=1
    left： 1   right：7,4,8,10,9
    4<5,return false;
  #############  
  输入：public boolean VerifySquenceOfBST(int [] sequence);

  后序遍历：
  1.1 判断数组长度，确认是否执行后续操作
  1.2 添加新方法，设定搜索树的查找范围：
      public boolean isBST(int[] sequence,int start,int end);
      最后一个数字为根结点，根据左子树结点小于根结点，右子树结点大于根结点，
      将数组拆分成两部分左子树、右子树，
  1.3 BST中，子树结点大于子树根结点，break；
      记录结束位置i，i前部分属于左子树，i之后到根结点之前为右子树；
      从i开始判断属于右子树的结点是否大于子树根结点，小于则返回false；
  1.4 依次遍历左右子树。


################
2. 二叉树中和为某一值的路径：路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
    前序遍历根结点；利用栈控制结点的出入，判断路径结点值的和与target是否相等，保存该条路径.

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
        if(root==null||root.val>target) return pathList;
        Stack<Integer> stack = new Stack<Integer>();
        FindPath(root,target,stack,pathList);
        return pathList;

    }
    public void FindPath(TreeNode root,int target,Stack<Integer> path,ArrayList<ArrayList<Integer>> pathList){
        if(root==null) return;
        //1.判断是否为叶结点
        if(root.left==null&&root.right==null){
            if(root.val==target){
                //将该结点添加到路径中
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i:path) {
                    list.add(new Integer(i));
                }
                list.add(root.val);
                pathList.add(list);
            }

        }else{
            //非叶子结点,将该结点添加到路径中
            path.push(new Integer(root.val));
            //判断子树路径值的和是否与新的target相等
            FindPath(root.left,target-root.val,path,pathList);
            FindPath(root.right,target-root.val,path,pathList);
            //到达叶子结点且值不相等,出栈
            path.pop();
        }
    }

3. 知识点
  * 分支限界法与回溯法
    * 相同点：二者都是一种在问题的解空间树T上搜索问题解的算法。

    * 不同点：
    1.在一般情况下，分支限界法与回溯法的求解目标不同。回溯法的求解目标是找出T中满足约束条件的所有解，而分支限界法的求解目标则是找出满足约束条件的一个解，或是在满足约束条件的解中找出使某一目标函数值达到极大或极小的解，即在某种意义下的最优解。
    2.回溯法与分支-限界法对解空间的搜索方式不同，回溯法通常采用尝试优先搜索，而分支限界法则通常采用广度优先搜索。
    3.对节点存储的常用数据结构以及节点存储特性也各不相同，除由搜索方式决定的不同的存储结构外，分支限界法通常需要存储一些额外的信息以利于进一步地展开搜索。
