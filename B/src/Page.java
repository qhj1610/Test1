import java.util.ArrayList;
import java.util.List;

/**
 * 构建分页对象
 * @param <T>
 */
public class Page<T> {

    public static final int DEFAULT_PAGESIZE = 15;
    /**
     * 页面列表
     */
    private List<T> items;
    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 每页记录个数
     */
    private int pageSize;
    /**
     * 当前页
     */
    private int currPage;

    Page(){

    }

    /**
     * 构造器
     * @param items
     * @param totalCount
     * @param pageSize
     * @param currPage
     */
    private Page(List<T> items,int totalCount,int pageSize,int currPage) {
        if (items==null) {
            this.items=new ArrayList<T>();
        }else {
            this.items=items;
        }
        this.totalCount = totalCount > 0 ? totalCount : 0;
        this.pageSize = pageSize > 1 ? pageSize : 1;
        this.currPage = currPage > 0 ? currPage : 1;
        //计算总页数
        if(totalCount > 0) {
            this.totalPage=this.totalCount % this.pageSize > 0 ? (this.totalCount/this.pageSize)+1 : this.totalCount/this.pageSize;
        }else {
            this.totalPage = 0;
        }
    }

    /**
     * 获取上一页
     * @param currPage
     * @return
     */
    public int getPrevPage(int currPage) {
        int prevPage = currPage > 1 ? currPage - 1 : 1;
        return prevPage;
    }

    /**
     *
     * 获取下一页
     */
    public int getNextPage(int currPage) {
        int nextPage = currPage >= totalPage ? totalPage : currPage++;
        return nextPage;
    }

    public int getTotalCount() { return totalCount; }

    public void setTotalCount(int totalCount) { this.totalCount = totalCount; }

    public int getTotalPage() { return totalPage; }

    public void setTotalPage(int totalPage) { this.totalPage = totalPage; }

    public int getPageSize() { return pageSize; }

    public void setPageSize(int pageSize) { this.pageSize = pageSize; }

    public int getCurrPage() { return currPage; }

    public void setCurrPage(int currPage) { this.currPage = currPage; }

    public List<T> getItems() { return items; }

    public void setItems(List<T> items) { this.items = items; }

    @Override
    public String toString() {
        return "Page{" +
                "items=" + items +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", currPage=" + currPage +
                '}';
    }
}
