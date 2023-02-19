package com.websarva.wings.android.euniclus_latestapi

/**
 * Block
 */
// 四角形のサイズ
val BLOCKSIZE = 80
// 間隔
val BLOCKSPACE = 20+BLOCKSIZE
// ブロックの表示開始位置 x
val BLOCKSTARTX = 210
// ブロックの表示開始位置 y
val BLOCKSTARTY = 210

/**
 * Field
 */
// 表示開始位置
val FIELDSTARTX = 100f
// 表示開始位置
val FIELDSTARTY = 200f
// フィールドの高さ
val FIELDHEIGHT = 1000
// フィールドの幅
val FIELDWIDTH = 700

// 表示開始位置からのオフセットを配列で持つ
val BlockTypeI = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCKSPACE),
    intArrayOf(0,BLOCKSPACE),
    intArrayOf(0,BLOCKSPACE*2),
    intArrayOf(0xFF, 0xFF, 0x00, 0x00)
)

val BlockTypeL = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCKSPACE),
    intArrayOf(0,BLOCKSPACE),
    intArrayOf(BLOCKSPACE,BLOCKSPACE),
    intArrayOf(0xFF, 0x00, 0xFF, 0x00)
)

val BlockTypeJ = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCKSPACE),
    intArrayOf(0,BLOCKSPACE),
    intArrayOf(-BLOCKSPACE,BLOCKSPACE),
    intArrayOf(0xFF, 0x00, 0x00, 0xFF)
)

val BlockTypeT = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCKSPACE),
    intArrayOf(0,BLOCKSPACE),
    intArrayOf(BLOCKSPACE,0),
    intArrayOf(0xFF, 252, 212, 27)
)

val BlockTypeO = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCKSPACE),
    intArrayOf(BLOCKSPACE,-BLOCKSPACE),
    intArrayOf(BLOCKSPACE,0),
    intArrayOf(0xFF, 215, 21, 126)
)

val BlockTypeS = arrayOf(
    intArrayOf(0,-BLOCKSPACE),
    intArrayOf(0,0),
    intArrayOf(BLOCKSPACE,-BLOCKSPACE),
    intArrayOf(-BLOCKSPACE,0),
    intArrayOf(0xFF, 0, 163, 219)
)

val BlockTypeZ = arrayOf(
    intArrayOf(0,0),
    intArrayOf(-BLOCKSPACE,-BLOCKSPACE),
    intArrayOf(0,-BLOCKSPACE),
    intArrayOf(BLOCKSPACE,0),
    intArrayOf(0xFF, 0xFF, 0xA0, 0x00)
)
