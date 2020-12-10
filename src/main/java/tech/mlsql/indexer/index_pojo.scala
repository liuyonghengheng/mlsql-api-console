package tech.mlsql.indexer

case class MysqlIndexerConfig(
                               name: String,
                               from: String,
                               partitionColumn: String,
                               partitionNum: Int,
                               syncInterval: Long
                             )

case class LoadStatement(raw: String, format: String, path: String, option: Map[String, String] = Map[String, String](), tableName: String)

case class PartitionBean(
                          upperBound: Long,
                          partitionNumValue: Long,
                          dbName: String,
                          indexerType: String,
                          partitionColumn: String,
                          lowerBound: Long,
                          tableName: String,
                          idCols:String
                        )