package logbook.gui;

import logbook.data.Data;
import logbook.data.DataType;
import logbook.data.context.GlobalContext;
import logbook.gui.logic.CreateReportLogic;
import logbook.gui.logic.TableItemCreator;
import logbook.scripting.TableItemCreatorProxy;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

/**
 * 開発報告書
 *
 */
public final class CreateItemReportTable extends AbstractTableDialog {

    /**
     * @param parent
     */
    public CreateItemReportTable(Shell parent, MenuItem menuItem) {
        super(parent, menuItem);
    }

    @Override
    protected void createContents() {
    }

    @Override
    protected String getTitleMain() {
        return "開発報告書";
    }

    @Override
    protected Point getSize() {
        return new Point(600, 350);
    }

    @Override
    protected String[] getTableHeader() {
        return CreateReportLogic.getCreateItemHeader();
    }

    @Override
    protected void updateTableBody() {
        this.body = CreateReportLogic.getCreateItemBody(GlobalContext.getCreateItemList());
    }

    @Override
    protected TableItemCreator getTableItemCreator() {
        return TableItemCreatorProxy.get("createitem");
    }

    /**
     * 更新する必要のあるデータ
     */
    @SuppressWarnings("incomplete-switch")
    @Override
    public void update(DataType type, Data data) {
        switch (type) {
        case CREATE_ITEM:
            this.needsUpdate = true;
        }
    }
}
