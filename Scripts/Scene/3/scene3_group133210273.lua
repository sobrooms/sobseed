local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1
L0_1 = {}
L0_1.group_id = 133210273
L1_1 = {}
L2_1 = {}
L2_1.config_id = 273001
L2_1.monster_id = 20010901
L3_1 = {}
L3_1.x = -3754.589
L3_1.y = 120.744
L3_1.z = -649.434
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 316.839
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 32
L2_1.drop_tag = "\229\164\167\229\143\178\232\142\177\229\167\134"
L2_1.area_id = 17
L3_1 = {}
L3_1.config_id = 273002
L3_1.monster_id = 20010801
L4_1 = {}
L4_1.x = -3754.168
L4_1.y = 120.382
L4_1.z = -642.259
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 193.536
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 32
L3_1.drop_tag = "\229\143\178\232\142\177\229\167\134"
L3_1.area_id = 17
L4_1 = {}
L4_1.config_id = 273003
L4_1.monster_id = 20010801
L5_1 = {}
L5_1.x = -3760.442
L5_1.y = 120.63
L5_1.z = -644.787
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 114.118
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 32
L4_1.drop_tag = "\229\143\178\232\142\177\229\167\134"
L4_1.area_id = 17
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
gadgets = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 273004
L3_1 = RegionShape
L3_1 = L3_1.SPHERE
L2_1.shape = L3_1
L2_1.radius = 5
L3_1 = {}
L3_1.x = -3757.231
L3_1.y = 120.773
L3_1.z = -645.948
L2_1.pos = L3_1
L2_1.area_id = 17
L1_1[1] = L2_1
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1273004
L2_1.name = "ENTER_REGION_273004"
L3_1 = EventType
L3_1 = L3_1.EVENT_ENTER_REGION
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ENTER_REGION_273004"
L2_1.action = "action_EVENT_ENTER_REGION_273004"
L1_1[1] = L2_1
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L1_1.suite = 1
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L2_1.monsters = L3_1
L3_1 = {}
L2_1.gadgets = L3_1
L3_1 = {}
L4_1 = 273004
L3_1[1] = L4_1
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ENTER_REGION_273004"
L3_1[1] = L4_1
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L3_1 = {}
L4_1 = {}
L5_1 = 273001
L6_1 = 273002
L7_1 = 273003
L4_1[1] = L5_1
L4_1[2] = L6_1
L4_1[3] = L7_1
L3_1.monsters = L4_1
L4_1 = {}
L3_1.gadgets = L4_1
L4_1 = {}
L3_1.regions = L4_1
L4_1 = {}
L3_1.triggers = L4_1
L3_1.rand_weight = 100
L1_1[1] = L2_1
L1_1[2] = L3_1
suites = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2
  L2_2 = A1_2.param1
  if L2_2 ~= 273004 then
    L2_2 = false
    return L2_2
  end
  L2_2 = ScriptLib
  L2_2 = L2_2.GetRegionEntityCount
  L3_2 = A0_2
  L4_2 = {}
  L5_2 = A1_2.source_eid
  L4_2.region_eid = L5_2
  L5_2 = EntityType
  L5_2 = L5_2.AVATAR
  L4_2.entity_type = L5_2
  L2_2 = L2_2(L3_2, L4_2)
  if L2_2 < 1 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_ENTER_REGION_273004 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2
  L2_2 = ScriptLib
  L2_2 = L2_2.AddExtraGroupSuite
  L3_2 = A0_2
  L4_2 = 133210273
  L5_2 = 2
  L2_2(L3_2, L4_2, L5_2)
  L2_2 = 0
  return L2_2
end
action_EVENT_ENTER_REGION_273004 = L1_1
