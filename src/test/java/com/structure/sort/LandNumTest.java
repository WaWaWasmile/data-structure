package com.structure.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author zcj
 * @date 2021/3/1 20:21
 */
@Slf4j
public class LandNumTest {

    @Test
    public void landNumTest(){
        char[][] git={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        int s=9;
        int i = sumIslands(git,s);
        //log.info("岛屿和等于s的岛屿数：{}",i);
        System.out.println("岛屿和等于s的岛屿数："+i);
    }
    /**
     * 计算岛屿和等于s的岛屿数
     * @param grid 网格
     * @param S
     * @return
     */
    public int sumIslands(char[][] grid,int S) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                int num = 0;
                if (grid[r][c] == '1') {
                    num = dfs(grid, r, c);
                }
                if (num == S){
                    ++num_islands;
                }
            }
        }
        return num_islands;
    }

    /**
     * 递归查找当前位置的上下左右是否为陆地
     * @param grid
     * @param r
     * @param c
     * @return
     */
    public int dfs(char[][] grid, int r, int c) {
        //判断是否超出边界
        if (!inArea(grid,r,c)){
            return 0;
        }
        if (grid[r][c]!='1'){
            return 0;
        }
        //遍历过的
        grid[r][c] = '2';
        return 1 + dfs(grid, r - 1, c)
                +dfs(grid, r + 1, c)
                +dfs(grid, r, c - 1)
                +dfs(grid, r, c + 1);
    }

    /**
     * 判断是否超出边界
     * @param grid
     * @param r
     * @param c
     * @return
     */
    public boolean inArea(char[][] grid, int r, int c) {
        return 0 <= r && r < grid.length
                && 0 <= c && c < grid[0].length;
    }
}
