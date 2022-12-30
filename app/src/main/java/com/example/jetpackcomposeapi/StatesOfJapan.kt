package com.example.jetpackcomposeapi

import java.util.Objects

data class StatesOfJapan(
    val s : Map<String,String> = mutableMapOf(
        "Fukuoka" to "JP-40"
    ),

    val states: Map<String,String> = mutableMapOf<String,String>(
        "愛知県" to "JP-23",
        "秋田県" to "JP-05",
        "青森県" to "JP-02",
        "千葉県" to "JP-12",
        "愛媛県" to "JP-38",
        "福井県" to "JP-18",
        "福岡県" to "JP-40",
        "福島県" to "JP-07",
        "岐阜県" to "JP-21",
        "群馬県" to "JP-10",
        "広島県" to "JP-34",
        "北海道" to "JP-01",
        "兵庫県" to "JP-28",
        "茨城県" to "JP-08",
        "石川県" to "JP-17",
        "岩手県" to "JP-03",
        "香川県" to "JP-37",
        "鹿児島県" to "JP-46",
        "神奈川県" to "JP-14",
        "高知県" to "JP-39",
        "熊本県" to "JP-43",
        "京都府" to "JP-26",
        "三重県" to "JP-24",
        "宮城県" to "JP-04",
        "宮崎県" to "JP-45",
        "長野県" to "JP-20",
        "長崎県" to "JP-42",
        "奈良県" to "JP-29",
        "新潟県" to "JP-15",
        "大分県" to "JP-44",
        "岡山県" to "JP-33",
        "沖縄県" to "JP-47",
        "大阪府" to "JP-27",
        "佐賀県" to "JP-41",
        "埼玉県" to "JP-11",
        "滋賀県" to "JP-25",
        "島根県" to "JP-32",
        "静岡県" to "JP-22",
        "栃木県" to "JP-09",
        "徳島県" to "JP-36",
        "東京都" to "JP-13",
        "鳥取県" to "JP-31",
        "富山県" to "JP-16",
        "和歌山県" to "JP-30",
        "山形県" to "JP-06",
        "山口県" to "JP-35",
        "山梨県" to "JP-19"
    )
)
