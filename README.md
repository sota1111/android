# android studio
## 実行方法
sh ~/.local/android-studio/bin/studio.sh
## SDK
``` sudo apt update && sudo apt install android-sdk ```
でインストールしたが、必要なSDKがインストールされたかは不明
## Emulator 
複数のアプリ立ち上げ可能
# 2 はじめてのアプリ作成
## 2.1 プロジェクト作成
APIは最も古いのを選択
## 2.2 AVD
AVD Managerボタンがない。スマホとAndroidマークのdevice Managerが同等の機能
該当するHWを選択して、ダウンロード
Enable Device Frameのチェックボックスを外す
## 2.3 アプリの起動
▲で実行。Hello worldが表示される。
## 2.4 プロジェクトのファイル構成
manifestsフォルダがない。
## 2.5 アプリ開発の基本手順
以下の3つを変更してアプリを開発する
- res/layoutフォルダ内のレイアウトXMLファイル
- javaフォルダ内の.ktファイル
- res/valuesフォルダ内のstrings.xml

# 3 ビューとアクティビティ
## 3.1 ビューの基礎知識
- string.xmlに文字列情報を追加する
- 画面非依存単位：dp:size, sp:text
## 3.2 画面部品をもう一つ追加する
- inputTypeでキーボードを指定できる。
## 3.3 レイアウトエディタのデザインモード
## 3.4 デザインモードで部品を追加してみる
textに表示する文字列はstring.xmlで定義してから用いる。
## 3.4 デザインモードで部品を追加してみる
## 3.5 LinearLayoutで部品を整列する
## 3.6 他のビューボタン-ラジオボタン/選択ボタン/リスト

# 4 イベントとリスナ
# 4.1 アプリ起動時に実行されるメソッド
Rクラス：リソースを管理する
# 4.2 イベントリスナ
# 4.3 ボタンをもう一つ追加してみる
ボタンのidをwhenで判断して実行する

# 5 リストビューとダイアログ
## 5.1 リストタップのイベントリスナ
OnItemClickListener：リストビューのタップというイベントに対するリスナーインターフェース
# 5.2 アクティビティ中でリストデータを生成する
# 5.3 ダイアログを表示する
let関数ブロック内では、nullチェック対象の変数はitに置き換わる。
関数ブロック内の末尾で記述した変数が関数の戻り値になる

# 6 ConstraintLayout
## 6.1 ConstraintLayout
配置に制約を持たせる
## 6.2 制約の設定には制約ハンドルを使う
## 6.3 ConstraintLayoutにおける3種類のlayout_width/height
## 6.4 横並びとベースライン
## 6.5 ガイドラインを利用する
## 6.6 チェイン機能を使ってみる
# 7 画面遷移とIntentクラス
## 7.1 2行のリストとSimpleAdapter