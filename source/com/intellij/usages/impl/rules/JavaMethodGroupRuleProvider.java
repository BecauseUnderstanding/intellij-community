package com.intellij.usages.impl.rules;

import com.intellij.usages.impl.FileStructureGroupRuleProvider;
import com.intellij.usages.rules.UsageGroupingRule;

/**
 * @author yole
 */
public class JavaMethodGroupRuleProvider implements FileStructureGroupRuleProvider {
  public UsageGroupingRule getUsageGroupingRule() {
    return new MethodGroupingRule();
  }
}
