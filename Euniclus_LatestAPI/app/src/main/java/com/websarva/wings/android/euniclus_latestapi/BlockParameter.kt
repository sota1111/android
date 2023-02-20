package com.websarva.wings.android.euniclus_latestapi
/**
 * Field
 */
// 表示開始位置
const val FIELD_START_X = 100f
// 表示開始位置
const val FIELD_START_Y = 20f
// フィールドの高さ
const val FIELD_HEIGHT = 1000
// フィールドの幅
const val FIELD_WIDTH = 700
// ブロックが落ちるまでのカウント
const val BLOCK_DOWN_CNT = 50

/**
 * Block
 */
// 四角形のサイズ
const val BLOCK_SIZE = 80
// 間隔
const val B_SPACE = 10
const val BLOCK_SPACE = B_SPACE+BLOCK_SIZE
// ブロックの表示開始位置 x
const val BLOCK_START_X = FIELD_START_X.toInt() + B_SPACE/2 + BLOCK_SPACE*5
// ブロックの表示開始位置 y
const val BLOCK_START_Y = FIELD_START_Y.toInt() + BLOCK_SPACE + B_SPACE/2



// 表示開始位置からのオフセットを配列で持つ
val BlockTypeI = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCK_SPACE),
    intArrayOf(0,BLOCK_SPACE),
    intArrayOf(0,BLOCK_SPACE*2),
    intArrayOf(0xFF, 0xFF, 0x00, 0x00)
)

val BlockTypeL = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCK_SPACE),
    intArrayOf(0,BLOCK_SPACE),
    intArrayOf(BLOCK_SPACE,BLOCK_SPACE),
    intArrayOf(0xFF, 0x00, 0xFF, 0x00)
)

val BlockTypeJ = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCK_SPACE),
    intArrayOf(0,BLOCK_SPACE),
    intArrayOf(-BLOCK_SPACE,BLOCK_SPACE),
    intArrayOf(0xFF, 0x00, 0x00, 0xFF)
)

val BlockTypeT = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCK_SPACE),
    intArrayOf(0,BLOCK_SPACE),
    intArrayOf(BLOCK_SPACE,0),
    intArrayOf(0xFF, 252, 212, 27)
)

val BlockTypeO = arrayOf(
    intArrayOf(0,0),
    intArrayOf(0,-BLOCK_SPACE),
    intArrayOf(BLOCK_SPACE,-BLOCK_SPACE),
    intArrayOf(BLOCK_SPACE,0),
    intArrayOf(0xFF, 215, 21, 126)
)

val BlockTypeS = arrayOf(
    intArrayOf(0,-BLOCK_SPACE),
    intArrayOf(0,0),
    intArrayOf(BLOCK_SPACE,-BLOCK_SPACE),
    intArrayOf(-BLOCK_SPACE,0),
    intArrayOf(0xFF, 0, 163, 219)
)

val BlockTypeZ = arrayOf(
    intArrayOf(0,0),
    intArrayOf(-BLOCK_SPACE,-BLOCK_SPACE),
    intArrayOf(0,-BLOCK_SPACE),
    intArrayOf(BLOCK_SPACE,0),
    intArrayOf(0xFF, 0xFF, 0xA0, 0x00)
)
