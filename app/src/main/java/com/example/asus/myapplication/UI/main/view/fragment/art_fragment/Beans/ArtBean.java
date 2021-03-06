package com.example.asus.myapplication.UI.main.view.fragment.art_fragment.Beans;

import java.util.List;

public class ArtBean {

    /**
     * code : 0
     * message : 成功
     * data : {"pageNum":1,"pageSize":4,"size":4,"startRow":0,"endRow":3,"total":4,"pages":1,"list":[{"id":83,"page":1,"rows":20,"organizationCode":"350010","title":"音乐","type":"2","urlType":"2","pcImgUrl":"","pcUrl":"","mobileImgUrl":"http://qiniu.5roo.com/173e5bac-bc1e-4270-8ab1-4204b478f38f.06.20.png","mobileUrl":"369","sortNo":null,"status":0,"createDate":1528089744000},{"id":97,"page":1,"rows":20,"organizationCode":"350010","title":"星愿联盟","type":"2","urlType":"2","pcImgUrl":"","pcUrl":"","mobileImgUrl":"http://qiniu.5roo.com/6a4aafa3-a405-406e-9830-4dc905671c47.png","mobileUrl":"254","sortNo":null,"status":0,"createDate":1528099372000},{"id":102,"page":1,"rows":20,"organizationCode":"350010","title":"你与音乐的距离，只差一部手机","type":"2","urlType":"0","pcImgUrl":"","pcUrl":"","mobileImgUrl":"http://qiniu.5roo.com/6716ad70-c6fd-4fbb-8638-d69609ddcc10.06.20 (1).png","mobileUrl":"","sortNo":null,"status":0,"createDate":1528596149000},{"id":103,"page":1,"rows":20,"organizationCode":"350010","title":"机构一广告3","type":"2","urlType":"0","pcImgUrl":"","pcUrl":"","mobileImgUrl":"http://qiniu.5roo.com/dae4234d-cc6c-4c54-9dd6-b2898d66239e.06.20.jpg","mobileUrl":"","sortNo":null,"status":0,"createDate":1528599761000}],"prePage":0,"nextPage":0,"isFirstPage":true,"isLastPage":true,"hasPreviousPage":false,"hasNextPage":false,"navigatePages":8,"navigatepageNums":[1],"navigateFirstPage":1,"navigateLastPage":1,"firstPage":1,"lastPage":1}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * pageNum : 1
         * pageSize : 4
         * size : 4
         * startRow : 0
         * endRow : 3
         * total : 4
         * pages : 1
         * list : [{"id":83,"page":1,"rows":20,"organizationCode":"350010","title":"音乐","type":"2","urlType":"2","pcImgUrl":"","pcUrl":"","mobileImgUrl":"http://qiniu.5roo.com/173e5bac-bc1e-4270-8ab1-4204b478f38f.06.20.png","mobileUrl":"369","sortNo":null,"status":0,"createDate":1528089744000},{"id":97,"page":1,"rows":20,"organizationCode":"350010","title":"星愿联盟","type":"2","urlType":"2","pcImgUrl":"","pcUrl":"","mobileImgUrl":"http://qiniu.5roo.com/6a4aafa3-a405-406e-9830-4dc905671c47.png","mobileUrl":"254","sortNo":null,"status":0,"createDate":1528099372000},{"id":102,"page":1,"rows":20,"organizationCode":"350010","title":"你与音乐的距离，只差一部手机","type":"2","urlType":"0","pcImgUrl":"","pcUrl":"","mobileImgUrl":"http://qiniu.5roo.com/6716ad70-c6fd-4fbb-8638-d69609ddcc10.06.20 (1).png","mobileUrl":"","sortNo":null,"status":0,"createDate":1528596149000},{"id":103,"page":1,"rows":20,"organizationCode":"350010","title":"机构一广告3","type":"2","urlType":"0","pcImgUrl":"","pcUrl":"","mobileImgUrl":"http://qiniu.5roo.com/dae4234d-cc6c-4c54-9dd6-b2898d66239e.06.20.jpg","mobileUrl":"","sortNo":null,"status":0,"createDate":1528599761000}]
         * prePage : 0
         * nextPage : 0
         * isFirstPage : true
         * isLastPage : true
         * hasPreviousPage : false
         * hasNextPage : false
         * navigatePages : 8
         * navigatepageNums : [1]
         * navigateFirstPage : 1
         * navigateLastPage : 1
         * firstPage : 1
         * lastPage : 1
         */

        private int pageNum;
        private int pageSize;
        private int size;
        private int startRow;
        private int endRow;
        private int total;
        private int pages;
        private int prePage;
        private int nextPage;
        private boolean isFirstPage;
        private boolean isLastPage;
        private boolean hasPreviousPage;
        private boolean hasNextPage;
        private int navigatePages;
        private int navigateFirstPage;
        private int navigateLastPage;
        private int firstPage;
        private int lastPage;
        private List<ListBean> list;
        private List<Integer> navigatepageNums;

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getStartRow() {
            return startRow;
        }

        public void setStartRow(int startRow) {
            this.startRow = startRow;
        }

        public int getEndRow() {
            return endRow;
        }

        public void setEndRow(int endRow) {
            this.endRow = endRow;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getPrePage() {
            return prePage;
        }

        public void setPrePage(int prePage) {
            this.prePage = prePage;
        }

        public int getNextPage() {
            return nextPage;
        }

        public void setNextPage(int nextPage) {
            this.nextPage = nextPage;
        }

        public boolean isIsFirstPage() {
            return isFirstPage;
        }

        public void setIsFirstPage(boolean isFirstPage) {
            this.isFirstPage = isFirstPage;
        }

        public boolean isIsLastPage() {
            return isLastPage;
        }

        public void setIsLastPage(boolean isLastPage) {
            this.isLastPage = isLastPage;
        }

        public boolean isHasPreviousPage() {
            return hasPreviousPage;
        }

        public void setHasPreviousPage(boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
        }

        public boolean isHasNextPage() {
            return hasNextPage;
        }

        public void setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
        }

        public int getNavigatePages() {
            return navigatePages;
        }

        public void setNavigatePages(int navigatePages) {
            this.navigatePages = navigatePages;
        }

        public int getNavigateFirstPage() {
            return navigateFirstPage;
        }

        public void setNavigateFirstPage(int navigateFirstPage) {
            this.navigateFirstPage = navigateFirstPage;
        }

        public int getNavigateLastPage() {
            return navigateLastPage;
        }

        public void setNavigateLastPage(int navigateLastPage) {
            this.navigateLastPage = navigateLastPage;
        }

        public int getFirstPage() {
            return firstPage;
        }

        public void setFirstPage(int firstPage) {
            this.firstPage = firstPage;
        }

        public int getLastPage() {
            return lastPage;
        }

        public void setLastPage(int lastPage) {
            this.lastPage = lastPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<Integer> getNavigatepageNums() {
            return navigatepageNums;
        }

        public void setNavigatepageNums(List<Integer> navigatepageNums) {
            this.navigatepageNums = navigatepageNums;
        }

        public static class ListBean {
            /**
             * id : 83
             * page : 1
             * rows : 20
             * organizationCode : 350010
             * title : 音乐
             * type : 2
             * urlType : 2
             * pcImgUrl :
             * pcUrl :
             * mobileImgUrl : http://qiniu.5roo.com/173e5bac-bc1e-4270-8ab1-4204b478f38f.06.20.png
             * mobileUrl : 369
             * sortNo : null
             * status : 0
             * createDate : 1528089744000
             */

            private int id;
            private int page;
            private int rows;
            private String organizationCode;
            private String title;
            private String type;
            private String urlType;
            private String pcImgUrl;
            private String pcUrl;
            private String mobileImgUrl;
            private String mobileUrl;
            private Object sortNo;
            private int status;
            private long createDate;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public int getRows() {
                return rows;
            }

            public void setRows(int rows) {
                this.rows = rows;
            }

            public String getOrganizationCode() {
                return organizationCode;
            }

            public void setOrganizationCode(String organizationCode) {
                this.organizationCode = organizationCode;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrlType() {
                return urlType;
            }

            public void setUrlType(String urlType) {
                this.urlType = urlType;
            }

            public String getPcImgUrl() {
                return pcImgUrl;
            }

            public void setPcImgUrl(String pcImgUrl) {
                this.pcImgUrl = pcImgUrl;
            }

            public String getPcUrl() {
                return pcUrl;
            }

            public void setPcUrl(String pcUrl) {
                this.pcUrl = pcUrl;
            }

            public String getMobileImgUrl() {
                return mobileImgUrl;
            }

            public void setMobileImgUrl(String mobileImgUrl) {
                this.mobileImgUrl = mobileImgUrl;
            }

            public String getMobileUrl() {
                return mobileUrl;
            }

            public void setMobileUrl(String mobileUrl) {
                this.mobileUrl = mobileUrl;
            }

            public Object getSortNo() {
                return sortNo;
            }

            public void setSortNo(Object sortNo) {
                this.sortNo = sortNo;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }
        }
    }
}
