0814
* 牛客网刷题编译运行通过，在本机intelli-j使用gradle完成编码并上传到github

1.二叉搜索树的后序遍历序列
  输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
  假设输入的数组的任意两个数字都互不相同。
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
  
