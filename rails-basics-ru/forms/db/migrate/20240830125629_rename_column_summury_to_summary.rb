class RenameColumnSummuryToSummary < ActiveRecord::Migration[7.2]
  def change
    rename_column :posts, :summury, :summary
  end
end
